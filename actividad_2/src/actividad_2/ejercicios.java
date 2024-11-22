package actividad_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicios {
    public static void ejercicio_1(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 1");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("ingresar edad");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("ingresar nacionalidad");
        String nationality = keyboard.nextLine();
        
        System.out.println("ingresar peso");
        double weigth = keyboard.nextInt();
        
        if (age < 15) {
            System.out.println("el deportista no es mayor de 15 años");            
            return;
        }
        if (!nationality.equals("colombiano")) {
            System.out.println("el deportista no es colombiano");            
            return;
        }
        if (weigth<=60 | weigth>=90) {
            System.out.println("el peso del deportista no esta en el rango permitido");            
            return;
        }
        
        System.out.println("El deportista es apto para competir");            
        
    }
    
    public static void ejercicio_3(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 3");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digitar 5 ventas");
        double sale_1 = keyboard.nextDouble();
        double sale_2 = keyboard.nextDouble();
        double sale_3 = keyboard.nextDouble();
        double sale_4 = keyboard.nextDouble();
        double sale_5 = keyboard.nextDouble();
        
        double[] sales = {sale_1, sale_2, sale_3, sale_4, sale_5};
        
        int more_than = 0;
        double total_sale=0;
        double greatest_sale=0;
        double lowest_sale=0;
        
        for (int i = 0; i < sales.length; i++) {
            if (sales[i]>1000000) {
                more_than++;
            }

            total_sale+=sales[i];
            
            if (sales[i]>greatest_sale) {
                greatest_sale=sales[i];
            }

            if (i==0){
                lowest_sale=sales[i];
            }
            
            if (sales[i]<lowest_sale) {
                lowest_sale=sales[i];
            }
            
        }
        
        double average = total_sale/sales.length;
        
        System.out.println("La cantidad de ventas mayores a un millon fueron "+more_than);
        System.out.println("El promedio de las ventas fue "+average);
        System.out.println("La mayor venta fue de "+greatest_sale);
        System.out.println("La menor venta fue de "+lowest_sale);
        
    }
    
    public static void ejercicio_6 () {
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 6");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
                
        System.out.println("Digitar ventas de los 5 vendedores");
        double seller_1 = keyboard.nextDouble();
        double seller_2 = keyboard.nextDouble();
        double seller_3 = keyboard.nextDouble();
        double seller_4 = keyboard.nextDouble();
        double seller_5 = keyboard.nextDouble();
        
        double salary_1 = 250000*4 + (seller_1 * 0.09);
        double salary_2 = 250000*4 + (seller_2 * 0.09);
        double salary_3 = 250000*4 + (seller_3 * 0.09);
        double salary_4 = 250000*4 + (seller_4 * 0.09);
        double salary_5 = 250000*4 + (seller_5 * 0.09);
        
        System.out.println("El salario del vendedor 1 es "+salary_1);
        System.out.println("El salario del vendedor 2 es "+salary_2);
        System.out.println("El salario del vendedor 3 es "+salary_3);
        System.out.println("El salario del vendedor 4 es "+salary_4);
        System.out.println("El salario del vendedor 5 es "+salary_5);
    }
    
    public static void ejercicio_10 () {
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 10");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        Boolean request = true;
        
        while (request) {            
            System.out.println("Digita la cantidad de horas trabajadas");
            int time = keyboard.nextInt();
            int salary;
            
            if (time <= 35) {
                salary = time*15000;
            } else {
                salary = 35*15000+(time-35)*27000;
            }
            
            System.out.println("El salario es de "+salary);
            
            System.out.println("-------------------------");
            System.out.println("Desea calcular otro salario? dijite 'si' o 'no'");
            keyboard.nextLine();
            String decision = keyboard.nextLine();
            if (!decision.equalsIgnoreCase("si")) {
                request=false;
            }
        }
    }
    
    public static void ejercicio_12(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 12");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Bienvenidos al juego de Picas y Fijas. \nPrimero, jugador 1, ingresa tu numero (no dejes que el jugador 2 lo vea ;) )");
        
        String player_1_selection = keyboard.nextLine();
        
        for (int i = 0; i<100;i++) {
            System.out.println("█▀█ █ █▀▀ ▄▀█ █▀   █▄█   █▀▀ █   █ ▄▀█ █▀\n█▀▀ █ █▄▄ █▀█ ▄█   ░█░   █▀  █ █▄█ █▀█ ▄█\n ");        
        }

        System.out.println("Ahora, jugador 2, ingresa tu numero (tampoco dejes que tu rival lo vea)");
        
        String player_2_selection = keyboard.nextLine();
        
        for (int i = 0; i<100;i++) {
            System.out.println("█▀█ █ █▀▀ ▄▀█ █▀   █▄█   █▀▀ █   █ ▄▀█ █▀\n█▀▀ █ █▄▄ █▀█ ▄█   ░█░   █▀  █ █▄█ █▀█ ▄█\n ");        
        }
          
        String[] player_1_array = player_1_selection.split("");
        String[] player_2_array = player_2_selection.split("");
        
        int turn = 1;
        
        boolean is_a_winner = false;
        
        do {            
            String player_to_play;
            String[] enemy_array;
            if (turn%2!=0) {
                player_to_play="jugador 1";
                enemy_array=player_2_array;
            } else {
                player_to_play="jugador 2";
                enemy_array=player_1_array;
            }
            System.out.println("Turno "+turn);
            System.out.println(player_to_play+", realiza tu intento");
            
            String attempt = keyboard.nextLine();
            String[] attempt_array = attempt.split("");
            
            int picas=0;
            int fijas=0;
            
            for(int i=0; i<enemy_array.length ; i++) {
                for (int j=0 ; j<attempt_array.length ; j++){
                    if(enemy_array[i].equals(attempt_array[j])){
                        if(i==j){
                            fijas++;
                        } else {
                            picas++;
                        }
                    }
                }
            }
            System.out.print("\033[1;31m"); 
       
            if (fijas==4) {
                System.out.println("Felicidades! has conseguido "+fijas+" fijas");
                is_a_winner=true;
            } else {
                System.out.println("Has obtenido "+picas+" picas y "+fijas+" fijas");
            }
            System.out.print("\033[0m");
            
            
            
            turn++;
        } while (!is_a_winner);
        
        System.out.println("Game over!");
    }
    
    public static void ejercicio_15(){
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 15");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa el dividendo");
        int dividendo = keyboard.nextInt();
        
        System.out.println("Ingresa el divisor");
        int divisor = keyboard.nextInt();
        
        int cociente=0;
        int residuo=dividendo;
        
        boolean seguir=true;
            
        do {            
            if(residuo<divisor){
                seguir = false;
            }else{
                residuo-=divisor;
                cociente++;
            }
            
        } while (seguir);
        System.out.println("El cociente es "+cociente+" y el residuo es "+residuo);
    }
    
    public static void ejercicio_18() {
    
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 18");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        boolean open = true;
        
        do {            

            double discount=0;

            System.out.println("Ingrese el valor de la compra");
            double sale=keyboard.nextDouble();
            keyboard.nextLine();
            System.out.println("Ingrese color de la bolita");
            
            boolean valid_color=false;
            String ball_color="";

            do {                
                String tiped_color= keyboard.nextLine();
                if("rojo".equalsIgnoreCase(tiped_color)|"roja".equalsIgnoreCase(tiped_color)|"amarillo".equalsIgnoreCase(tiped_color)|"amarilla".equalsIgnoreCase(tiped_color)|"blanco".equalsIgnoreCase(tiped_color)|"blanca".equalsIgnoreCase(tiped_color)){
                    ball_color=tiped_color;
                    valid_color=true;
                } else {
                    System.out.println("Color no valido. Ingreselo nuevamente.");
                }
            } while (!valid_color);
            
            
            if (ball_color.equalsIgnoreCase("rojo") | ball_color.equalsIgnoreCase("roja")) {
                discount=0.4;
                valid_color=true;
            }
            if (ball_color.equalsIgnoreCase("amarillo") | ball_color.equalsIgnoreCase("amarilla")) {
                discount=0.25;
                valid_color=true;
            }
            if (ball_color.equalsIgnoreCase("blanco") | ball_color.equalsIgnoreCase("blanca")) {
                valid_color=true;
                discount=0;
            }
            
            double discount_money = sale*discount;
            System.out.println("El descuento es de "+discount_money);
            
            
            System.out.println("Para cerrar la tienda, escriba 'cerrar'. Para atender otro cliente, presione enter");
            String decision = keyboard.nextLine();
            if("cerrar".equalsIgnoreCase(decision)){
                open=false;
            }
        } while (open);
    }
    
    public static void ejercicio_23 () {
    
        System.out.print("\033[1;34m"); 
        System.out.println("Ejercicio 23");
        System.out.print("\033[0m");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresar numero a convertir en binario");
        int number = keyboard.nextInt();
        
        ArrayList<Integer> binary_list = new ArrayList<>();
        
        while (number>1) {            
            binary_list.add(0,number%2);
            number = number/2;
        }
        binary_list.add(0,number);

        for (int i=0 ; i<binary_list.size(); i++ ){
            System.out.print(binary_list.get(i));
        }
        System.out.println("");
    }
    public static void prueba () {
int a=5;       
int b=6;       

if(a==5 && b!=6){           
    System.out.println("entro al if a==5 && b!=6");       
 }       

if(a>4){           
    System.out.println("entro al if a>4");       
 } else if(b==6){             
   System.out.println("entro al if b==6");       
 }       

if((a+b)>10){           
   System.out.println("entro al if (a+b)>10");       
 } else{               
   System.out.println("entro al else");                   
 }
    }
}
