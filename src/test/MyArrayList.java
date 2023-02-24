package test;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    public String get(int index){
        return  array[index];
    }

    public  void add(String element){
        array[size] = element;
        size++;
        if (size == array.length){ //новый массив
            String[] newArray = new String[array.length*2]; // будет в два раза больше
            for (int i = 0; i < newArray.length; i++){ // элементы из старого массива в новый
                newArray[i] = array[i];
            }
            array = newArray; // присвоим значение
        }
    }

    public void  remove (int index){
        for (int i = index; i < size - 1 ; i++ ){
        array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }


    public void remove (String element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, array[i])) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
