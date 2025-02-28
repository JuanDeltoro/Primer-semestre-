/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import javax.swing.JOptionPane;


/**
 *
 * @author Matrix
 */
public class Tareajuanpablo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double x,y,resultado;
    x = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
    y = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo valor"));
    resultado = (3)* Math.pow (x,2)- (3)*Math.pow (y,2)*(y)+ (3)* (x)*Math.pow(y,2);
    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    
}
