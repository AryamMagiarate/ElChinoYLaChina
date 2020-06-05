/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcalculadora;

import static java.lang.Double.NaN;

/**
 *
 * @author Mayra M.F
 */
public class Calculadora {

    public static double suma(double a, double b) {

        return a + b;

    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;

    }

    public static double division(double a, double b) {
        if (b == 0) {
            return NaN;
        } else {
            return a / b;
        }

    }// fin division

    public static double potencia(double a, double b) {
        if (b == 0 && a != 0) {
            return 1;
        } else if (a == 0 && b == 0) {
            return NaN;
        } else if (a == NaN && b == NaN || a == NaN && b == 0) {
            return NaN;
        } else {
            return Math.pow(a, b);
        }

    }// fin potencia
    public static double raiz(double a, double b){
        if (b==0) {
            return NaN;
            
        }else if(b==1){
            System.out.println("El indice de raiz deberia ser mayor a 1!!");
        return a;
        }else{
        return Math.pow(a, 1/b);
        
        }
    
    
    
    
    }

}
