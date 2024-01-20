package J04019;

public class Triangle {
    private Point p1, p2, p3;
    private double d1, d2, d3;
    private double perimeter;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.d1 = p1.getDist(p2);
        this.d2 = p2.getDist(p3);
        this.d3 = p3.getDist(p1);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public String getPerimeter() {
        perimeter = d1 + d2 + d3;
        return String.format("%.3f", perimeter);
    }

    public boolean valid() {
        if (d1 + d2 > d3 && d2 + d3 > d1 && d3 + d1 > d2) {
            return true;
        } else {
            return false; // Không thể tạo thành tam giác
        }
    }
}
