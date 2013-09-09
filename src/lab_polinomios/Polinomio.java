/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_polinomios;

/**
 *  Esta clase permite construir un polinomio de grado 2 y realizar
 * operaciones de suma resta y derivada.
 * @author Camilo Rodríguez
 */
public class Polinomio {
    int a; // coeficiente de x2
    int b; // coeficiente x
    int c; // término independiente
    
    // Constructor 
    // Método que se llama igual que la clase
    // No retorna nada PERO NO LLEVA LA PALBRA VOID
    /**
     * El método constructor recibe los coeficientes del polinomio
     * @param coefA  representa el coeficiente de x a la 2
     * @param coefB  representa el coeficiente de x
     * @param coefC  representa el término independiebnte
     */    
    
    public Polinomio(int coefA, int coefB, int coefC)
    {
       this.a = coefA;
       this.b = coefB;
       this.c = coefC;
    }        
    
    public String toString()
    {
        String s = "";
        if(this.a!=0)
        {
            s = s+this.a+"x^2";
        }   
        if(this.b>0)
        {
            if(this.a!=0)
            {
                s=s+"+";
            }    
             s = s+this.b+"x";
        }
        else if(b<0)
        {
              s = s+this.b+"x";
              
        }    
        if(this.c>0)
        {
            if(this.a!=0 || this.b!=0)
            {
               s = s + "+"; 
            }    
            s = s+this.c;
        }   
        else
        {
            s = s+this.c;
        }    
        
        
        return s;
    }        
    
    Polinomio  sumar (Polinomio p)
    {
        Polinomio resultante;
        resultante = new Polinomio(0,0,0);
        resultante.a = this.a + p.a;
        resultante.b = this.b + p.b;
        resultante.c = this.c + p.c;
        return resultante;
    }   
    
    Polinomio  restar (Polinomio p)
    {
        Polinomio resultante;
        resultante = new Polinomio(0,0,0);
        resultante.a = this.a - p.a;
        resultante.b = this.b - p.b;
        resultante.c = this.c - p.c;
        return resultante;
    }   
    int evaluar (int x)
    {
        int resultante;
        
        resultante = x*x*this.a + x* this.b + this.c;
        
        return resultante;
    }        
    // 2x2 +3x -1
    
    //      4x +3
    Polinomio derivar()
    {
        Polinomio resultante;
        resultante = new Polinomio(0,0,0);
        resultante.a = 0;
        resultante.b = this.a * 2;
        resultante.c = this.b;
        
        return resultante;
    }        
    
}
