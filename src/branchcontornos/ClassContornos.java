
package branchcontornos;

import javax.swing.JOptionPane;

public class ClassContornos {
    //método switch case
    public void calcularArea(){ 
     int  opcion = Integer.parseInt(JOptionPane.showInputDialog("Elegir opción: \n1.Cuadrado \n2.Triángulo \n3.Círculo "));
        switch (opcion) {
            case 1: 
                float lado = Float.parseFloat(JOptionPane.showInputDialog("Introducir lado "));
                    JOptionPane.showMessageDialog(null, lado*lado);
                break;
            case 2: 
                float base = Float.parseFloat(JOptionPane.showInputDialog("Introducir base "));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introducir altura "));
                    JOptionPane.showMessageDialog(null, base*altura/2);
                break;
            case 3: 
                float radio = Float.parseFloat(JOptionPane.showInputDialog("Introducir radio "));
                    JOptionPane.showMessageDialog(null, Math.PI*Math.pow(radio, 2));
                break;
            default: JOptionPane.showMessageDialog(null, "Opción incorrecta ");
        }
    }
}