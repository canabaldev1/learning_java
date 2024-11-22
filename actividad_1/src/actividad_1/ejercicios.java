
package actividad_1;

import java.util.Scanner;

public class ejercicios {
    public static void ejercicio_1(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 1");
        System.out.print("\033[0m");

        Scanner keyboard = new Scanner(System.in);
        
        int value_per_hour,time;
       
        
        System.out.println("ingresar valor de la hora");
        value_per_hour = keyboard.nextInt();
        System.out.println("ingresar cantidad de horas");
        time = keyboard.nextInt();
        
        int gross_salary = value_per_hour * time;
        double net_salary = gross_salary * 0.95;
        double tax = gross_salary * 0.05;
        
        System.out.println("El salario total es $"+gross_salary);
        System.out.println("El salario neto es $"+net_salary);
        System.out.println("La retencion es $"+tax);
        
    }
    
    public static void ejercicio_3(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 3");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa nota de primer corte");
        double first_period_grade = keyboard.nextDouble();
        System.out.println("Ingresa nota de segundo corte");
        double second_period_grade = keyboard.nextDouble();
        
        double rest = 3 - (first_period_grade *0.2) - (second_period_grade*0.2);
        
        String tird_period_grade = String.format("%.2f",rest/0.6);
        
        System.out.println("La nota minima que debe sacar en el tercer corte es "+tird_period_grade);
        
    }
    
    public static void ejercicio_5 () {
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 5");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa longitud del primer lado");
        double first_side = keyboard.nextDouble();
        System.out.println("Ingresa longitud del segundo lado");
        double second_side = keyboard.nextDouble();
        System.out.println("Ingresa longitud del tercer lado");
        double third_side = keyboard.nextDouble();
        
        double perimeter = first_side + second_side + third_side;
        
        System.out.println("El perimetro del triangulo es "+perimeter);
    }
    
    public static void ejercicio_8 (){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 8");
        System.out.print("\033[0m");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Cual es la distancia en millas marinas?");
        int distance = keyboard.nextInt();
        
        System.out.println("La distancia en metros es "+ (distance*1852));
    
    }
    
    public static void ejercicio_10 () {
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 10");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Escriba el valor del articulo");
        double price = keyboard.nextDouble();
        double iva = price*0.19;
        
        System.out.println("El valor del iva del articulo es $"+iva);
    }
    
    public static void ejercicio_17(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 17");
        System.out.print("\033[0m");
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Valor del lado 1");
        double side_1 = keyboard.nextDouble();
        System.out.println("Valor del lado 2");
        double side_2 = keyboard.nextDouble();
        
        double area = side_1 * side_2;
        double perimeter = (side_1*2)+(side_2*2);
        
        System.out.println("el perimetro del rectangulo es "+perimeter);
        System.out.println("el area del rectangulo es "+area);
        
    }
    
    public static void ejercicio_19 () {
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 19");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Escriba el valor de x");
        double x = keyboard.nextDouble();
        System.out.println("Escriba el valor de y");
        double y = keyboard.nextDouble();
        System.out.println("Escriba el valor de z");
        double z = keyboard.nextDouble();
        
        double a = 2*x*x * y*y*y * z;
        
        System.out.println("El valor de A es "+a);
    }
}
