package Feb8;

import java.util.Arrays;

public class DynamicArray {

    private Integer[] data;
    private int count;// считает, на какой индекс вставлять элемент
    private int size; // размер массива



    public DynamicArray() {
        data = new Integer[1];
        count = 0;
        size = 1;
    }



    public int size() {
        int size = count;
        return size;
    }

    public void addToStart(int element) {
        if(count == size) {
            growSize();
        }
        for (int i = count - 1; i >=0 ; i--) {
            data[i + 1] = data[i];

        }
        data[0] = element;
        count++;
    }

    public void addWithIndex(int index, int element) {
        if(count == size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i-1];

        }
        data[index] = element;
        count++;
    }



    public void removeFirst() {
        for (int i = 0; i < count; i++) {
            data[i] = data[i+1];
        }
        data[count-1] = null;
        count--;
        if(count < size/2) {
            shrinkSize();
        }

    }

    public void removeLast() {
        data[count-1] = null;
        if(count < size/2) {
            shrinkSize();
        }
    }


    // Homework
    public void removeWithIndex(int index) {
        int nulls = 0;
        if (index > size-1) {
            System.out.println("Нет такого индекса в массиве");
        }
        for (int i = index; i < size-1; i++) {
                data[i] = data[i+1]; // НИЧЕГО БОЛЬШЕ ТУТ НЕ МЕНЯТЬ!!
        }
        /*for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
            } nulls++;
        }
        if(nulls > data.length - nulls) {
            shrinkSize();
        }*/

    }
    // Проблема 1: если массив не имеет изначально null в конце, то последний индекс надо сделать null.
    // То есть надо сделать проверку, есть ли там null-ы.
    // Проблема 2: Как урезать массив? Надо сравнить количество null-ов с длиной массива минус null-ы
    // Почему size = 5 после операции (было добавлено 5 элементов, после отработки метода длина осталась 5, хотя 5-й элемент стал null)?

    public void set(int index, int element) {
        if (index > 0 || index < count) {
            data[index] = element;
        }
    }


    public void shrinkSize() {
        Integer[] newData = new Integer[size/2];
        for (int i = 0; i < size; i++) {
            newData [i] = data[i];
        }
        data = newData;
        size = data.length;
    }

    private void growSize() {
        Integer[] newData = new Integer[size*2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];

        }
        data = newData;
        size = data.length;
    }

    // add an element to the end

    public void add(int element) {
        if(count == size) {
            growSize();
        }
            data[count] = element;
            count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

}
