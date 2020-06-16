import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String s = new Scanner(System.in).nextLine();
        //Увести з клавіатури рядок з декількох слів. Скласти рядок з перших літер слів з переведенням цих літер у верхній регістр
        String s = "Hello, Java!";
        System.out.println(toAbbreviation(s));

    }

    static String toAbbreviation(String s) {
        StringBuilder result = new StringBuilder();
        String mached = s.toUpperCase();

        Pattern pattern = Pattern.compile("\\b([A-Z]|[a-z]|[А-Я]|[а-я])");
        Matcher matcher = pattern.matcher(mached);

        while (true) {
            if (matcher.find())
                result.append(mached.charAt(matcher.end() - 1) + ".");
            else break;
        }
        return result.toString();
    }
}
