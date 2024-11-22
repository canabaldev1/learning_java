/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lm-carlos
 */
public class funciones {
    
    public static double raiz (int num) {
    
        double result = Math.sqrt(num);
        
        System.out.println(result);
        
        return result;
    
    }
    
    public static int numeroAleatorio () {
    
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 51);
                
        return numeroAleatorio;
    }
    
    public static boolean esPerfecto(int num) {
        int suma = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        
        return suma == num;
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR: no se perimite la division por 0");
            return Double.NaN;
        } else {
            return a / b;
        }
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double n1, n2, resultado = 0;

        System.out.println("CALCULADORA BARATA\nSeleccione alguna operacion MATEMATICA");
        System.out.println("#1: SUMA");
        System.out.println("#2: RESTA");
        System.out.println("#3: MULTIPLICACIoN");
        System.out.println("#4: DIVISIoN");
        System.out.println("#5: SALIR");
        System.out.print(">");
        opcion = teclado.nextInt();

        if (opcion != 5) {
            System.out.print("Ingrese el primer numero:> ");
            n1 = teclado.nextDouble();
            System.out.print("Ingrese el primer numero:> ");
            n2 = teclado.nextDouble();
            
                    
            switch (opcion) {
                case 1:
                    System.out.println("SUMA");
                    resultado = sumar(n1, n2);
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 2:
                    System.out.println("RESTA");
                    resultado = restar(n1, n2);
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    resultado = multiplicar(n1, n2);
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 4:
                    System.out.println("DIVISION");
                    resultado = dividir(n1, n2);
                    System.out.println("Resultado: "+ resultado);
                    break;
                default:
                    System.out.println("OPCION NO VALIDA\n\n");
            }
        }
        
        if (opcion != 5) {
            menu();
        } else {
            System.out.println("gracias por usar la calculadora");
        }
    }
    
    public static int numeroAleatorioRec(int min, int max) {
        Random random = new Random();
        int numero = random.nextInt(max - min + 1) + min;

        if (numero >= min && numero <= max) {
            return numero;
        } else {
            return numeroAleatorioRec(min, max);
        }
    }
    
    public static boolean esPerfectoRec(int num) {
    
        int sumaDiv = sumaDivisores(num, num-1);
                
        return sumaDiv == num;
    
    }    
    
    public static int sumaDivisores (int num, int divisor) {
        
        if (divisor == 0) {
        return 0;
        }
    
        if (num % divisor == 0) {
            return divisor + sumaDivisores(num, divisor - 1);
        
        } else {
            return sumaDivisores(num, divisor - 1);
        }
    
    }
    
    public static int factorial (int num) {
    
        if (num <0) {
            return -1;
        }
        
        if (num == 0) {
            return 1;
        }
        
        return num * factorial(num-1);
    
    }

    
}
