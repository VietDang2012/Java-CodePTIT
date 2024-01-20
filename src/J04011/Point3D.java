package J04011;

public class Point3D {
    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int[] vector1 = { p2.x - p1.x, p2.y - p1.y, p2.z - p1.z };
        int[] vector2 = { p3.x - p1.x, p3.y - p1.y, p3.z - p1.z };
        int crossProductX = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        int crossProductY = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        int crossProductZ = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return crossProductX * (p4.x - p1.x) + crossProductY * (p4.y - p1.y) + crossProductZ * (p4.z - p1.z) == 0;
    }
}