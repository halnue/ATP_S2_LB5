import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int value = 20;

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("g g");
//                new Scanner(System.in).nextLine());

//        matcher.replaceAll(replace.toString());
//        System.out.println(matcher.toString());
        System.out.println(format("g g"));
        System.out.println(format("gg gg g"));
        System.out.println(format("ggggg gg gggggggg"));
        System.out.println(format("g g g g"));
    }

    static String format(String string) {
        StringBuilder s = new StringBuilder(string);
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find())
            count++;
        int lack = (value - s.length() + count) / count;
        StringBuilder replace = new StringBuilder("");
        for (int i = 0; i < lack; i++) {
            replace.append(" ");
        }
        StringBuilder result = new StringBuilder(s.toString().replaceAll(" ", replace.toString()));
        for (int i = 0; i < (value - s.length() + count) % count; i++) {
            result.append(" ");
        }
        return result.toString();
    }
}
