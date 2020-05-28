package homework10;

public class Triangle {
    public double base;
    public double height;
    public double a;
    public double b;
    public double c;

    public double AreaTriangle(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }
    public boolean compareTriangles(double a, double b, double c) {
        if (a == b && b == c && c == a) {
            return true;
        } else {
            return false;
        }
    }
}
