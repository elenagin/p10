import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica10 {
    public static void main(String args[]) {
        int grado;
        double a = 0, b = 0, c = 0, d = 0;
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
                a = entrada.nextDouble();
            } else if (i == 2) {
                b = entrada.nextDouble();
            } else if (i == 1) {
                c = entrada.nextDouble();
            } else if (i == 0) {
                d = entrada.nextDouble();
            }
        }
        System.out.println("\nIngresa los límites de integración:\na= ");
        l1 = entrada.nextInt();
        System.out.println("\nb= ");
        l2 = entrada.nextInt();

        eq.setArea(a, b, c, d, l1, l2);
        //JOptionPane.showMessageDialog(null, "Area:\n"+ eq.getArea());

        System.out.println("Area = " );

    }
}
