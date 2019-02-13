import java.util.Scanner;

public class Practica10 {
    public static void main(String args[]) {
        int grado;
        float a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        ecuacion eq = new ecuacion(grado, a, b, c, d);

        do {
            System.out.println("Ingresa el grado de la ecuación:");
            grado = entrada.nextInt();
        } while (grado > 3 || grado < 1);

        for (int i = grado; i >= 0; i--) {
            System.out.println("Ingresa el grado " + i + " de la ecuación:");
            if (i == 3) {
                a = entrada.nextFloat();
            } else if (i == 2) {
                b = entrada.nextFloat();
            } else if (i == 1) {
                c = entrada.nextFloat();
            } else if (i == 0) {
                d = entrada.nextFloat();
            }
        }

        eq.setArea();
    }
}
