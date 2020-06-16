public class Main {
    static int[] list = createList(1000);

    public static void main(String[] args) {

        change();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }


    static void change() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0 || list[i]==1||list[i]==-1)
                continue;
                for (int i1 = i + i; i1 < list.length; i1 += i) {
                    list[i1] = -1;
                }
        }
    }

    static int[] createList(int size) {
        int[] list = new int[size+1];
        for (int i = 0; i <= size; i++)
            list[i] = i;
        return list;
    }
}
