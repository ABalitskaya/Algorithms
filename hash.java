import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        int[] array = {1,7,4,3,4,8,7};
        int k = 2;

        check(array, k);

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {5,6,2,1,4,3,5};

        System.out.println(isArraysEquals(array1,array2));

    }

    // :)))))) На досуге напишу еще разные варианты, понимаю, что это читерство :)
    public static boolean isArraysEquals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);
            return (Arrays.equals(array1, array2));
        }
    }
    public static void check(int[] array, int k) {
        Integer answer = null;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                    if(count == k) {
                        answer = array[i];
                        break;
                    }
                }
            }
            if (answer != null) {
                break;
            }
        } if(answer!=null) {
            System.out.println("Ответ найден: " + answer);
        } else {
            System.out.println("Ответ не найден");
        }
    }

    public static int firstElement(int[] arr, int n, int k) {
        // unordered map to count occurrences of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = 0;
            if (map.get(arr[i]) != null) {
                a = map.get(arr[i]);
            }
            map.put(arr[i], a + 1);
        }
        for (int i = 0; i < n; i++) { // if count of element == k ,then it is the required first element
            if (map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int firstElementNative(int[] arr, int n, int k) {
        // This loop is used for selection of elements
        for (int i = 0; i < n; i++) {
            int count = 0; // Count how many times selected element occurs
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) { // Check, if it occurs k times or not
                return arr[i];
            }
        }
        return -1;
    }

    public boolean isHasRepeatedElement(ArrayList<Integer> arrayList){
        HashSet<Integer> set = new HashSet<>(arrayList);
        return set.size() != arrayList.size();
    }


}

