/*
 El programa principal permite a el usuario seleccionar una operación
aritmetica, solicita 2 nums, y muestra el resultado x pantalla
 */
package test;

import java.util.Scanner;
import operaciones.OperacionesAritmeticas;

/**
 *
 * @author Alumno Mañana
 */
public class test {
    
    public static void main(String[] args) {
        
        // Declaro Scanner para leer los datos de entrada
        Scanner lectura = new Scanner (System.in);
        
        //Declaro objeto de clase Aritmetica para poder acceder a las opera
        OperacionesAritmeticas arit = new OperacionesAritmeticas();
        
        System.out.println("Introduce el primer valor: ");
        int a = lectura.nextInt();
        
        System.out.println("Introduce el segundo valor: ");
        int b = lectura.nextInt();
        
        System.out.println("Operacion de suma de " + a + " + " + b + " = " +
                arit.sumar(a, b));
        System.out.println("Operacion de resta de " + a + " - " + b + " = " +
                arit.resta(a, b));
        System.out.println("Operacion de multiplicación de " + a + " * " + b +
                " = " + arit.multiplicacion(a, b));
        System.out.println("Operacion de division de " + a + " / " + b + " = " +
                arit.division(a, b));
        
        
    }
    
}
