public class NumberFibonacciLoop {
    private static int n = 92;
    private static long[] list = new long[n];
    private static int last = 2;

    static {
        list[0] = 1;
        list[1] = 1;
    }

    public static long getNumberFibonacciLoop(int number) throws InappropriateNumberException {
        if (number > n || number < 1)
            throw new InappropriateNumberException();
        for (int i = last; i < number; i++) {
            list[i] = list[i - 2] + list[i - 1];

        }
       if (number > 2)
           last = number - 1;
        return list[number - 1];
    }
}
