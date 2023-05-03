package HomeTasks4;
/*
*реализовать вторую задачу через собственный класс используя в основе массив
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/
public class Task4 {
    public static void main(String[] args) {
        MyQueue que = new MyQueue();
        que.enqueue(3);//enqueue() - помещает элемент в конец очереди
        que.enqueue(2);
        que.enqueue(1);
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.print();
        System.out.println(que.dequeue());//dequeue() - возвращает первый элемент из очереди и удаляет его
        que.print();
        System.out.println(que.dequeue());
        que.print();
        que.enqueue(7);
        que.enqueue(8);
        que.print();
        System.out.println(que.first());//first() - возвращает первый элемент из очереди, не удаляя.
        que.print();


    }
}
