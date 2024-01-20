package J04009;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getDist(Point A) {
        return Math.sqrt(Math.pow(this.x - A.x, 2) + Math.pow(this.y - A.y, 2));
    }
}
