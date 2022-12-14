public class HW2 {
    /*First level:  1) Вычислить сложность следующих алгоритмов


    ANSWER: O(n)
    void test1(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++)
            for (int j=1; j<=n; j++)
                System.out.println("*");
        break;
    }

    ANSWER: O(n^2)
    void test2(int n)
    {
        if (n==1) //O(n)
            return;
        for (int i=1; i<=n; i++) // O(n)
            for (int j=1; j<=n; j++) O(n)
                System.out.println("*");
    }

    ANSWER: O(n^2)
    void test3(int n)
    {
        int a = 0;
        for (i = 0; i < n; i++) //O(n)
            for (j = n; j > i; j--) //O(n)
                a = a + i + j;

    }

    ANSWER: O(n/2) * O(log(n)) = O(log(n)*n)
    void test4(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++) //O(n/2)
            for (j = 2; j <=n; j=j*2) O(log_2(n))
                a=a+n/2;

    }


2) Find the element that appears once in a sorted array
    Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.


    Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент.
    // Это задание уже было в прошлый раз.


    Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.
3)

    BEST: i<=0 | O(1)
    WORST: O(1) + O(1) = O(2)
    void test5(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i; //O(1)
            i /= 2; //O(1)
        }
    }

    BEST: a < b: O(1)
    WORST: O(1)
    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b; O(1)
            } else {
                b = b - a; O(1) если a == b
            }
        }
    }

    BEST: i>=n/2 -> O(1)
    WORST: O(n^3)
    void method2(int n) {
        for (int i = 0; i < n / 2; i++) { //
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) { 
                    System.out.println("I am expert!");
                }
            }
        }
    }

    BEST: n<1 -> O(1)
    WORST: O(n^2)
    void method3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }

*/

}
