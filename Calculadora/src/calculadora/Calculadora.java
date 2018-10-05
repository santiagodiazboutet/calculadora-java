/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author capacita_mecon
 */
public class Calculadora {
    private static float Resultado;
    private static char Operador;
    
    
    public static void Sumar(int a, int b)
    {
        Resultado=a+b;
    }
    public static void Restar(int a, int b)
    {
        Resultado=a-b;
        
    }
    public static void Multiplicar(int a, int b)
    {
        Resultado=a*b;
        
    }
    public static void Dividir(int a, int b)
    {
        Resultado=(float)a/b;
        
    }
    public static void SetOperador(char a)
    {
        Operador =a;
        
    }
    public static char GetOperador()
    {
        return Operador;
    }
    public static void CalcularOperador(int a, int b)
    {
        switch(Operador)
        {
            case '*':
                Multiplicar(a,b);
                System.out.println("El resultado es: "+Resultado);
                break;
            case '/':
                Dividir(a,b);
                System.out.println("El resultado es: "+Resultado);
                break;
            case '+':
                Sumar(a,b);
                System.out.println("El resultado es: "+Resultado);
                break;
            case '-':
                Restar(a,b);
                System.out.println("El resultado es: "+Resultado);
                break;
            default:
                System.out.println("Operador invalido. Intente nuevamente");
                break;
        }
        
        
        
    }
}
