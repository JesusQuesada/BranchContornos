
package branchcontornos;

import javax.swing.JOptionPane;

public class ClassContornos {
    //método switch case
    public void calcularArea(){ 
     int  opcion = Integer.parseInt(JOptionPane.showInputDialog("Elegir opción: \n1.Cuadrado \n2.Triángulo \n3.Círculo "));
        switch (opcion) {
            case 1: 
                float lado = Float.parseFloat(JOptionPane.showInputDialog("Introducir lado "));
                    //System.out.println(lado*lado);
                break;
            case 2: 
                float base = Float.parseFloat(JOptionPane.showInputDialog("Introducir base "));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introducir altura "));
                    //System.out.println(base*altura/2);
                break;
            case 3: 
                float radio = Float.parseFloat(JOptionPane.showInputDialog("Introducir radio "));
                    //System.out.println(Math.PI*Math.pow(radio, 2));
                break;
            default: //System.out.println("Opción incorrecta ");
        }
    }
}