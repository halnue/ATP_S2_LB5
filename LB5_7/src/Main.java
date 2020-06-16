public class Main {
    public static void main(String[] args) throws CannotBeCalculatedException {
        QuadraticEquation quadraticEquation = new QuadraticEquation(0, 1, 4);
        quadraticEquation.solve();
        quadraticEquation.getX1();
        System.out.println(quadraticEquation.getX1());
        System.out.println(quadraticEquation.getX2());
    }
}
