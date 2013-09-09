/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_polinomios;

import javax.swing.JFrame;

/**
 *
 * @author 202
 */
public class Lab_Polinomios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Polinomio p1, p2;
        // 2x2 +3x -4
        p1 = new Polinomio(0,-9,-4);
        p2 = new Polinomio(1,3,2);
        
        System.out.println(p1.sumar(p2).derivar().evaluar(4));
        
        Polinomio p3 = p1.sumar(p2);
        Polinomio p4 = p3.derivar();
        int w = p4.evaluar(4);
        System.out.println(w);
      
        
        
        
    }
}
