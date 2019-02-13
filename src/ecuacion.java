public class ecuacion {
    private float area,g,a,b,c,d;

    public ecuacion(int grado, float a, float b, float c, float d) {

        a=a;
        b=b;
        c=c;
        d=d;
        g=grado;
    }

    public void setArea() {
        area=g*a;
    }

    public void getArea() {
        return area;
    }

    //public void Imprimir() {
    //System.out.println(nombre + " deberá pagar la cantidad de $" + getMontoNuevo()+ ", se aplicó un descuento del " + descuento + "%.");
    //}
}
