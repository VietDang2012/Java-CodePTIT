package J04009;

public class Triangle {
    private Point A = new Point(0, 0), B = new Point(0, 0), C = new Point(0, 0);
    private double AB, BC, CA;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        AB = A.getDist(B);
        BC = B.getDist(C);
        CA = C.getDist(A);
    }

    @Override
    public String toString() {
        if (AB + BC <= CA || BC + CA <= AB || CA + AB <= BC) {
            return String.format("INVALID");
        }
        double p = (AB + CA + BC) / 2.0;
        return String.format("%.2f", Math.sqrt(p * (p - AB) * (p - CA) * (p - BC)));
    }
}
