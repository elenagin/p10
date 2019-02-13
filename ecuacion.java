public class ecuacion {
    private float area;

    public void setArea(int grado, float a, float b, float c, float d) {
        float delta = (b - a) / 6;
        float suma = 0;


        for (int i = 0; i < 6; i++) {
            float first_mid_p = a + (delta / 2) + i * delta;
            suma += (first_mid_p * first_mid_p - first_mid_p + 3);
        }
        area = suma * delta;
    }

    public float getArea() {
        return area;
    }
}
