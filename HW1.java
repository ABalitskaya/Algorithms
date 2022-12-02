package nov20;

import java.lang.reflect.Array;

public class HW1 {
    public static void main(String[] args) {

        int[] test = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(test, 12));

        int[] test1 = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(test1, 2));

        int[]test2 = new int[] {0,0,1,1,2,2,3,3,4,4,5,6,6,7,7};
        System.out.println(uniqueElement(test2));

        int[] test3 = new int[] {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7};
        System.out.println(uniqueElement(test3));
    }

    public static int linearSearch (int[] array, int key) {
        // space complexity = O
        // max time complexity: array.length

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) { //array.lenght
                    return i;
            }
        } return -1;
    }

    public static int uniqueElement (int[]array) {
        // space complexity = O
        // array.length/2 + 1 (делим длину массима пополам без остатка и далее +1, если кол-во элементов нечетное)


        for (int i = 0; i < array.length; i++, i++) {
            if (array[i] != array[i+1]) { // array.length / 2 (без остатка) + 1
                return i;
            }
        } return -1;
    }
    }

