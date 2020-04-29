import com.sun.istack.internal.NotNull;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    @NotNull
    private double x1 = -1;

    public double getX1() {
        if (x1 == -1)
            throw new NullPointerException();
        return x1;
    }

    @NotNull
    private double x2 = -1;

    public double getX2() {
        if (x2 == -1)
            throw new NullPointerException();
        return x2;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int solve() {
        double dis = b * b - (4 * a * c);
        if (dis > 0) {
            calculateX1(Math.sqrt(dis));
            calculateX2(Math.sqrt(dis));
            return 2;
        } else if (dis == 0) {
            calculateX1(0);
            calculateX2(0);
            return 1;
        } else {
            return -1;
        }
    }

    private void calculateX1(double sqrtDis) {
        x1 = (-1 * b + sqrtDis) / 2 * a;
    }

    private void calculateX2(double sqrtDis) {
        x2 = (-1 * b - sqrtDis) / 2 * a;

    }
}
