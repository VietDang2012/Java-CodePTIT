package J04010;

public class Triangle {
    private double AB, BC, CA, Area;

    public Triangle() {
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);
        AB = A.distance(B);
        BC = B.distance(C);
        CA = C.distance(A);
        Area = Math.sqrt((AB + BC + CA) * (AB + BC - CA) * (BC + CA - AB) * (CA + AB - BC)) / 4;
    }

    @Override
    public String toString() {
        if (AB + BC <= CA || BC + CA <= AB || CA + AB <= BC) {
            return String.format("INVALID");
        } else {
            double Radius = (AB * BC * CA) / (4 * Area);
            return String.format("%.3f", Math.pow(Radius, 2) * Math.PI);
        }
    }

}
