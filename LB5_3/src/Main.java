import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = createList(20);
        System.out.print("Before sort");
        printArray(array);
        System.out.println();
        System.out.print("After sort ");
        printArray(sort(array));
    }

    static void printArray(int[] array){
        System.out.print(" = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }

    static int[] createList(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = (int) (Math.random()*size);
        return array;
    }

    static int findMin(int first ,int[] array){
        int min = first;
        for (int i = first; i < array.length; i++) {
            if (array[min]>array[i])
                min= i;
        }
        return min;
    }

    static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = findMin(i,array);
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
        return array;
    }



}
