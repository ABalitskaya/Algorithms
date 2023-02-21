package Feb15;

public class Queue {
    /*Описание занятия: 1. Классическая Queue - реализовать используя массив (Array)
    pushToEnd(int data) - вставляет элемент в конец queue
    remove() - удаляет элемент из начала queue
    peek() - возвращает элемент из начала не удаляя его
    isEmpty()
    size()*/

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Queue(8);
        System.out.println("Пустая ли очередь? " + queue.isEmpty());
        System.out.println("Размер очереди: " + queue.size());
        queue.pushToEnd(4);
        queue.pushToEnd(66);
        queue.pushToEnd(9);
        queue.pushToEnd(2);
        queue.pushToEnd(3);
        queue.pushToEnd(5);
        queue.pushToEnd(32);
        queue.pushToEnd(12);
        System.out.println("Размер массива: " + queue.size());
        queue.remove();
        System.out.println("Размер очереди после удаления 1 элемента: " + queue.size());
        System.out.println("Первый элемент в очереди: " + queue.peek());



    }

    public int[] arr;      // массив для хранения элементов queue
    public int head;      // head указывает на первый элемент в queue
    public int tail;       // tail часть указывает на последний элемент в queue
    public int capacity;   // максимальная емкость queue
    public int count;      // текущий размер queue


// Конструктор для инициализации queue

public void Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    // Проверяем, пустой ли массив (true/false)
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Просто возвращает размер
    public int size() {
        return count;
    }

    // Добавляет в конец элемент
    public void pushToEnd(int element) {
        tail = (tail + 1);
        arr[tail] = element;
        count++;
    }

    //Удаляет элемент из начала
    public int remove() {
    if (isEmpty() == true) {
        System.out.println("Массив пустой");
    }
    int helper = arr[head]; //
        head = (head+1);
        count--;
        return helper;
    }


    // Смотрит на первый элемент в очереди
    public int peek() {
    if (isEmpty() == true) {
        System.out.println("Массив пустой");
    }
    return arr[head];
    }




}
