package homework10;

public class Triangle {
    double base;
    double height;
    double a;
    double b;
    double c;


    public static double AreaTriangle(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    public static boolean compareTriangles(double a, double b, double c) {

        if (a == b && b == c && c == a) {
            return true;
        } else {
            return false;
        }
    }
}
