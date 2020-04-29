import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> listPrimeNumber = new LinkedList();

    public static void main(String[] args) {
        List<Integer> list = createList();

        list = list.stream().map(integer -> changeValue(integer)).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(listPrimeNumber);
    }

    static int changeValue(Integer integer) {
        if (checkNumber(integer)) {
            listPrimeNumber.add(integer);
            return integer;
        } else
            return integer = -1;
    }

    static List<Integer> createList() {
        List list = new LinkedList<Integer>();
        for (int i = 2; i <= 300; i++)
            list.add(i);
        return list;
    }

    static boolean checkNumber(int n) {
        AtomicBoolean result = new AtomicBoolean(true);
        listPrimeNumber.forEach(integer -> {
            if (n % integer == 0)
                result.set(false);
        });
        return result.get();
    }
}
