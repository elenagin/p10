import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {
    double aa = 0, bb = 0, cc = 0, dd = 0;
    
    public ventana() {
        super("Integrales");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6, 1));
        cp.setBackground(Color.green);
        ecuacion eq = new ecuacion();


        JPanel panelOne = new JPanel();
        panelOne.setLayout(new GridLayout(3, 1));
        panelOne.setBackground(Color.green);
        panelOne.add(new JLabel("ECUACIÓN"));
        panelOne.add(new JLabel("Ingresa el grado de la ecuación:"));
        JTextField gradoTF = new JTextField(30);
        panelOne.add(gradoTF);


        JPanel panelTwo = new JPanel();
        panelTwo.setLayout(new

                GridLayout(3, 4));
        panelTwo.setBackground(Color.yellow);
        panelTwo.add(new

                JLabel(""));
        panelTwo.add(new

                JLabel("Ingresa el coeficiente correspondiente:"));
        panelTwo.add(new

                JLabel(""));
        panelTwo.add(new

                JLabel(""));
        JTextField aTF = new JTextField(30);
        panelTwo.add(aTF);
        JTextField bTF = new JTextField(30);
        panelTwo.add(bTF);
        JTextField cTF = new JTextField(30);
        panelTwo.add(cTF);
        JTextField dTF = new JTextField(30);
        panelTwo.add(dTF);
        panelTwo.add(new

                JLabel("x³"), BorderLayout.CENTER);
        panelTwo.add(new

                JLabel("  x²"));
        panelTwo.add(new

                JLabel("  x"));
        panelTwo.add(new

                JLabel("  cte"));

        JPanel panelThree = new JPanel();
        panelThree.setLayout(new

                FlowLayout());
        panelThree.setBackground(Color.yellow);
        panelThree.add(new

                JLabel(""));

        JPanel panelFour = new JPanel();
        panelFour.setLayout(new

                GridLayout(3, 2));
        panelFour.setBackground(Color.green);
        panelFour.add(new

                JLabel("Ingresa los límites de la ecuación"));
        panelFour.add(new

                JLabel(""));
        JTextField lUnoTF = new JTextField(30);
        panelFour.add(lUnoTF);
        JTextField lDosTF = new JTextField(30);
        panelFour.add(lDosTF);
        panelFour.add(new

                JLabel("   a"));
        panelFour.add(new

                JLabel("   b"));

        JPanel panelFive = new JPanel();
        panelFive.setLayout(new FlowLayout());
        panelFive.setBackground(Color.green);
        JButton calcular = new JButton("Calcular");
        panelFive.add(calcular);

        JPanel panelSix = new JPanel();
        panelSix.setLayout(new FlowLayout());
        panelSix.setBackground(Color.green);
        JLabel resultado = new JLabel("Resultado");
        panelSix.add(resultado);

        cp.add(panelOne, BorderLayout.CENTER);
        cp.add(panelTwo, BorderLayout.CENTER);
        cp.add(panelThree, BorderLayout.CENTER);
        cp.add(panelFour, BorderLayout.CENTER);
        cp.add(panelFive, BorderLayout.CENTER);
        cp.add(panelSix, BorderLayout.CENTER);



        class ManejadorEventos implements ActionListener {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == calcular) {
                    try {
                        int grado = Integer.parseInt(gradoTF.getText().substring(0, 1));
                        for (int i = grado; i >= 0; i--) {
                            if (i == 3) {
                                aa= Double.parseDouble(aTF.getText().substring(0, 1));
                            } else if (i == 2) {
                                bb =  Double.parseDouble(bTF.getText().substring(0, 1));
                            } else if (i == 1) {
                                cc =  Double.parseDouble(cTF.getText().substring(0, 1));
                            } else if (i == 0) {
                                dd =  Double.parseDouble(dTF.getText().substring(0, 1));
                            }
                        }

                        int lim1 = Integer.parseInt(lUnoTF.getText().substring(0, 2));
                        int lim2 = Integer.parseInt(lDosTF.getText().substring(0, 2));

                        eq.setArea(aa, bb, cc, dd, lim1, lim2);
                        JOptionPane.showMessageDialog(ventana.this, String.format("Área es: %s", eq.getArea()));
                        resultado.setText("Area es: " + eq.getArea() + " Unidades");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: ", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        ManejadorEventos manejador = new ManejadorEventos();
        calcular.addActionListener(manejador);
    }
}
