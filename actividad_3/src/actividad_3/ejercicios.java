/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_3;

import java.util.Scanner;

/**
 *
 * @author lm-carlos
 */
public class ejercicios {
    public static void ejercicio_6 () {
    
        int numeroGenerado = funciones.numeroAleatorio();
        
        System.out.println("Número aleatorio: "+numeroGenerado);
    
    }

    public static void ejercicio_7 () {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Ingrese un número :  ");
        int num = scanner.nextInt();
        
        if (funciones.esPerfecto(num)) {
            System.out.println(num +  " es un número perfecto. ");
        } else {
            System.out.println(num + "  no es un número perfecto. ");
        }
    
    }
    
    public static void ejercicio_11 () {
    
        funciones.menu();
        
    }
    
    public static void ejercicio_13() {
    
        int numRandom = funciones.numeroAleatorioRec(1, 50);
        
        System.out.println("Número aleatorio: " + numRandom);
    
    }
    
        public static void ejercicio_14 () {
    
            Scanner scanner = new Scanner(System.in);
        
            System.out.println(" Ingrese un número :  ");
            int num = scanner.nextInt();
        
            if (funciones.esPerfectoRec(num)) {
            System.out.println(num +  " es un número perfecto. ");
            } else {
            System.out.println(num + "  no es un número perfecto. ");
            }
    
    }

    
    public static void ejercicio_15 () {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int num = teclado.nextInt();
        
        int factorialCalculado = funciones.factorial(num);
        
        if (factorialCalculado < 0 ) {
            System.out.println("el numero no es valido");
        } else {
            System.out.println("el factorial del numero "+" es "+factorialCalculado);
        }
        
    }
    
    public static void ejercicio_5 () {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int num = teclado.nextInt();
        
        double raizCalculado = funciones.raiz(num);
        
        System.out.println("la raiz de "+num+" es "+raizCalculado);
        
    }
    
}
