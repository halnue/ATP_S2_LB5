public class LinearEquation {
    private double k;
    private double b;

    public LinearEquation(double k, double b) {
        this.k = k;
        this.b = b;
    }

    private double x = -1;
    boolean isExistX = false;

    public double getX() throws CannotBeCalculatedException {
        if (!isExistX)
            throw new CannotBeCalculatedException();
        return x;
    }

    int solve() {
        if (k == 0) {
            if (b == 0)
                return -1;
            if (b != 0)
                return 0;
        }
        calculateX();
        return 1;

    }

    private void calculateX() {
        x = b / k;
        isExistX = true;
    }
}
