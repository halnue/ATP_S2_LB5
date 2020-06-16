import com.sun.istack.internal.NotNull;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    @NotNull
    private double x1 = -1;
    boolean isExistX1 = false;

    public double getX1() throws CannotBeCalculatedException {
        if (!isExistX1)
            throw new CannotBeCalculatedException();
        return x1;
    }

//    @NotNull
    private double x2 = -1;
    boolean isExistX2 = false;
    public double getX2() throws CannotBeCalculatedException {
        if (!isExistX2)
            throw new CannotBeCalculatedException();
        return x2;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int solve() {
        if (a == 0) {
            LinearEquation linearEquation = new LinearEquation(b, c);
            int result = linearEquation.solve();
            try {
                x1 = linearEquation.getX();
                isExistX1 = true;
            } catch (Exception e) {
                isExistX1 = false;
            }
            return result;
        }
        double dis = b * b - (4 * a * c);
        if (dis > 0) {
            calculateX1(Math.sqrt(dis));
            calculateX2(Math.sqrt(dis));
            return 2;
        } else if (dis == 0) {
            calculateX1(0);
            calculateX2(0);
            return 2;
        } else {
            return -1;
        }
    }

    private void calculateX1(double sqrtDis) {
        x1 = (-1 * b + sqrtDis) / (2 * a);
        isExistX1 = true;
    }

    private void calculateX2(double sqrtDis) {
        x2 = (-1 * b - sqrtDis) / (2 * a);
        isExistX2 = true;
    }
}
