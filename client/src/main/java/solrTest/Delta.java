package solrTest;

/**
 * Created by vladislav on 15.01.14.
 */
public class Delta {
    private Double x;
    private Double y;

    public Delta(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(Double x) {

        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {

        return x;
    }

    public Double getY() {
        return y;
    }
}
