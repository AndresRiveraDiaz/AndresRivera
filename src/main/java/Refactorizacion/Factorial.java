/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Refactorizacion;

public class Factorial {

    public static void main(String[] args) {
            System.out.print(Factorial.factorial(5));
    }
    
    public static int factorial(double numero){
        if (numero==0)
            return 1;
        else
            return (int) (numero * factorial(numero - 1));
    }
            
}
        
    

