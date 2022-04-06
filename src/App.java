import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame{
    private static JLabel direccionesLabel = new JLabel("Elija los botones en orden correcto.");
    private static JButton opcunoButton = new JButton("Click me");
    private static JButton opcdosButton = new JButton("Click me");
    private static JButton opctresButton = new JButton("Click me");
    private static int[] ordenNum = {1,2,3};
    private static int cont =0;
    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Tarea 4");
        window.setLayout(new FlowLayout());
        window.getContentPane().add(direccionesLabel);
        window.getContentPane().add(opcunoButton);
        window.getContentPane().add(opcdosButton);
        window.getContentPane().add(opctresButton);

        opcunoButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    buttonClick(e,1);
                }
        });
        opcdosButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClick(e,2);
            }
        });
        opctresButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClick(e,3);
            }
        });

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void buttonClick(ActionEvent e, int x){
        JFrame f = new JFrame("frame");
        f.setSize(400, 400);
        if (x!=ordenNum[cont]){
            cont=0;
            JDialog d = new JDialog(f, "Caja de Dialogo");
            JLabel l = new JLabel("Orden incorrecto,!");
            d.add(l);
            d.setSize(250, 250);
            d.setVisible(true);
            throw new ArithmeticException("Orden incorrecto.");
        }
        else{
            cont+=1;
            if (cont==3){
                JDialog d = new JDialog(f, "Caja de Dialogo");
                JLabel l = new JLabel("Orden correcto encontrado!");
                d.add(l);
                d.setSize(250, 250);
                d.setVisible(true);
            }
        }

    }
}
