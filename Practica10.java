import java.util.Scanner;

public class Practica10 {
    public static void main(String args[]) {
        int grado;
        float a = 0, b = 0, c = 0, d = 0;
        int l1, l2;
        Scanner entrada = new Scanner(System.in);
        ecuacion eq = new ecuacion();

        do {
            System.out.println("ECUACIÓN\nIngresa el grado de la ecuación:");
            grado = entrada.nextInt();
        } while (grado > 3 || grado < 1);

        for (int i = grado; i >= 0; i--) {
            System.out.println("Ingresa el coeficiente para el grado " + i + " de x:");
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

        do {
            System.out.print("\nIngresa los límites de integración:\na= ");
            l1 = entrada.nextInt();
            System.out.print("\nb= ");
            l2 = entrada.nextInt();
        } while (l1 < 0 && l2 > 10);

        eq.setArea(grado, a, b, c, d, l1, l2);
        System.out.println("Area = " + eq.getArea());

    }
}
