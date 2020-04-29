import java.util.ArrayList;

public class Main {
    static ArrayList<Long> list = new ArrayList();

    public static void main(String[] args) {
        list.add((long) 1);
        list.add((long) 1);
        findNumberFibonacci(92);
        System.out.println(list);
    }


    static void findNumberFibonacci(int number) {
        if (list.size() <= number - 1)
            findNumberFibonacci(number - 1);
        list.add(list.get(number - 2) + list.get(number - 1));
    }
}
