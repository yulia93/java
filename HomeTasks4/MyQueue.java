package HomeTasks4;

import java.util.Arrays;
import java.util.Objects;


public class MyQueue {
    private Integer[] arr = new Integer[10];
    private int size = 0;


    void enqueue(int num){// - помещает элемент в конец очереди
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }
    int dequeue(){//- возвращает первый элемент из очереди и удаляет его
      int num = arr[0];
        Integer[] arr2 = new Integer[arr.length];
        System.arraycopy(arr, 1, arr2, 0, arr.length-1);
        arr = arr2;
        size--;
        return num;
    }
    int first() {//- возвращает первый элемент из очереди, не удаляя.
    return arr[0];
    }
    void print(){// -печатает всю queue
        StringBuilder sB = new StringBuilder();
        sB.append("[");
        Arrays.stream(arr).filter(Objects::nonNull).forEach(item -> {
            sB.append(" ");
            sB.append(item);
            sB.append(" ,");
        });
        sB.deleteCharAt(sB.length()-1);
        sB.append("]");
        System.out.println(sB);
    }
    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int num){
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }

    int peek(){
//        if (!empty()){
        return arr[size - 1];
//        } else {
//            throw new IndexOutOfBoundsException();
//        }
    }

    int pop(){
        return arr[--size];
    }
}
