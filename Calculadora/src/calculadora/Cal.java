/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int continuar =1;
        int opcion=0;
        int numero1=0;
        int numero2=0;
        char operador;
        Scanner lector = new Scanner(System.in);
        
        
                System.out.println("Ingrese el primer numero.");
                numero1=lector.nextInt();
                System.out.println("Ingrese el segundo numero.");
                numero2=lector.nextInt();
                Calculadora.SetOperador('+');
                operador=Calculadora.GetOperador();
                System.out.println("Su operador es: "+operador);
                Calculadora.CalcularOperador(numero1, numero2);
                Calculadora.SetOperador('-');
                operador=Calculadora.GetOperador();
                System.out.println("Su operador es: "+operador);
                Calculadora.CalcularOperador(numero1, numero2);
                Calculadora.SetOperador('/');
                operador=Calculadora.GetOperador();
                System.out.println("Su operador es: "+operador);
                Calculadora.CalcularOperador(numero1, numero2);
                Calculadora.SetOperador('*');
                operador=Calculadora.GetOperador();
                System.out.println("Su operador es: "+operador);
                Calculadora.CalcularOperador(numero1, numero2);
        
    }
    
}
