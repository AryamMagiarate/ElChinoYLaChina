/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Mayra M.F
 */
public class TestingCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nùmero: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nùmero: "));

        System.out.println(a + " + " + b + " = " + Calculadora.suma(a, b));
        System.out.println(a + " - " + b + " = " + Calculadora.resta(a, b));
        System.out.println(a + " * " + b + " = " + Calculadora.multiplicacion(a, b));
        System.out.println(a + " / " + b + " = " + Calculadora.division(a, b));
        System.out.println(a + "^" + b + " = " + Calculadora.potencia(a, b));

    }

}
