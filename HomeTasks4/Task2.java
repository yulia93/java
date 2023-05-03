package HomeTasks4;

import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = Task1.creatList(10,0,10);
        System.out.println(lst);
        enqueue(lst,99);
        System.out.println(lst);
        System.out.println(dequeue(lst));
        System.out.println(lst);
        System.out.println(first(lst));
        System.out.println(lst);

    }
    static void enqueue(LinkedList<Integer> lst, int item){
        lst.add(item);
    }
    static int dequeue(LinkedList<Integer> lst){
        return lst.removeFirst();
    }
    static int first (LinkedList<Integer> lst){

        return lst.getFirst();
    }
}
