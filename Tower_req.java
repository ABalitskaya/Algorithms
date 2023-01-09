package Dec14.HW_Tower;

import java.util.Stack;

/*
Чтобы переложить стек из n дисков, нужно:
1) переложить стек из n-1 дисков на другую палку
2) переложить n-ный (самый большой) диск на свободную палку
3) переложить стек из n-1 дисков на палку, где лежит самый большой диск.

Пункт 3) представляет собой выполнение тех же пунктов, но количество дисков каждый раз будет уменьшаться на 1 (в этом и рекурсия здесь)

 */

public class Tower_req {
    public static void main(String[] args) {
        Stack<Integer> firstPole = new Stack<>();
        Stack<Integer> secondPole = new Stack<>();
        Stack<Integer> thirdPole = new Stack<>();
        firstPole.push(5);
        firstPole.push(4);
        firstPole.push(3);
        firstPole.push(2);
        firstPole.push(1);
        //System.out.println(firstPole);
        hanoiMethod(firstPole, secondPole, thirdPole, firstPole.size());


    }

    public static void hanoiMethod (Stack<Integer> firstPole, Stack<Integer> secondPole, Stack<Integer> thirdPole, int numOfRings) {
        if (numOfRings > 0) {
           hanoiMethod(firstPole, thirdPole, secondPole, numOfRings - 1);
           int biggestDisk = firstPole.pop(); //
           thirdPole.push(biggestDisk); // Переношу на thirdPole самый большой диск
           hanoiMethod(secondPole, firstPole, thirdPole, numOfRings - 1);
            System.out.println("На третьем диске сейчас: " + thirdPole);
            System.out.println("На вспомогательном диске: " + secondPole);
            System.out.println("На первом диске осталось: " + firstPole);
            // Распечатанные результаты сбивают с толку... Не совсем поняла, в какой из моментов идет распечатка при рекурсивном вызове? Можете на уроке рассказать?


        }

    }
}