public class ecuacion {
    private double area;
    private double delta = 0.005;

    public void setArea(double a, double b, double c, double d, int l1, int l2) {
        for (float i = l1; i < l2; i += delta)
            area += (a * i * i * i) + (b * i * i) + (c * i) + d;
    }

    public double getArea() {
        return area * delta;
    }
}
