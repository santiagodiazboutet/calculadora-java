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
        
        while(continuar!=0)
        {
            System.out.println("Ingrese 1- ingresar un operador y realizar una cuenta. 0- para salir.");
            continuar=lector.nextInt();
            if(continuar!=0)
            {
                System.out.println("Ingrese el primer numero.");
                numero1=lector.nextInt();
                System.out.println("Ingrese el segundo numero.");
                numero2=lector.nextInt();
                System.out.println("Ingrese el simbolo de la operacion que desea realizar.");
                Calculadora.SetOperador(lector.next().charAt(0));
                operador=Calculadora.GetOperador();
                System.out.println("Su operador elegido es: "+operador);
                Calculadora.CalcularOperador(numero1, numero2);
                
                
            }
             
            
        }
        
        
        
    }
    
}
