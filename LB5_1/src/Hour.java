public class Hour implements Comparable<Hour> {
    private int quantityPassenger;
    private String comment;

    public Hour(int quantityPassenger, String comment) {
        this.quantityPassenger = quantityPassenger;
        this.comment = comment;
    }

    public int getQuantityPassenger() {
        return quantityPassenger;
    }

    public void setQuantityPassenger(int quantityPassenger) {
        this.quantityPassenger = quantityPassenger;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int compareTo(Hour o) {
        if (quantityPassenger > o.getQuantityPassenger())
            return 1;
        else if (quantityPassenger < o.getQuantityPassenger())
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "quantityPassenger=" + quantityPassenger +
                ", comment='" + comment + '\'' +
                '}';
    }
}
