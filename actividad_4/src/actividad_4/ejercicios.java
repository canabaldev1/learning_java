/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lm-carlos
 */
public class ejercicios {
    
    public static void ejercicio_1 () {
    
        int[] numeros_1_50 = new int[50];
        
        for (int i = 0; i <= 49; i++) {
            numeros_1_50[i] = i+1;
        }
        
        System.out.println(Arrays.toString(numeros_1_50));
    
    }

    public static void ejercicio_6 () {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite la longitud del arreglo");
        int longitud = teclado.nextInt();
        
        int[] arreglo = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Digite el valor en la posición "+i);
            arreglo[i] = teclado.nextInt();
        }
        
        System.out.println("Su arreglo quedó de la siguiente forma");        
        System.out.println(Arrays.toString(arreglo));
        
        System.out.println("Digite el valor a eliminar");
        int valorAEliminar = teclado.nextInt();
        
        for (int i = 0; i < longitud; i++) {
            if (arreglo[i]==valorAEliminar) {
                arreglo[i]=0;
            }
        }
        
        System.out.println("Se eliminó el valor "+valorAEliminar+" y su arreglo quedó de la siguiente forma");        
        System.out.println(Arrays.toString(arreglo));
        
    
    }
    
    public static void ejercicio_7 () {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite la longitud del arreglo");
        int longitud = teclado.nextInt();
        
        int[] arreglo = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Digite el valor en la posición "+i);
            arreglo[i] = teclado.nextInt();
        }
        
        System.out.println("Su arreglo quedó de la siguiente forma");        
        System.out.println(Arrays.toString(arreglo));

        System.out.println("Ingrese la posición del arreglo que desea actualizar (0 a " + (arreglo.length - 1) + "):");
        int posicion = teclado.nextInt();

        if (posicion < 0 || posicion >= arreglo.length) {
            System.out.println("Posición inválida.");
            return;
        }

        System.out.println("Ingrese el nuevo valor:");
        int nuevoValor = teclado.nextInt();

        arreglo[posicion] = nuevoValor;

        System.out.println("Arreglo modificado:");       
        System.out.println(Arrays.toString(arreglo));
        System.out.println();
        
        
    }
    

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        private static ArrayList<String> datoslista = new ArrayList<>();
    private static JFrame frame;

    public static String ingresar_dato() {
        frame = new JFrame();
        String dato = JOptionPane.showInputDialog(frame, "Introduce nuevo dato");
        return dato;
    }

    public static void mostrar_datos() {
        JOptionPane.showMessageDialog(frame,
                datoslista,
                "DATOS DEL ARREGLO",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void buscar_dato() {
        String mensaje = JOptionPane.showInputDialog(frame, "ingresa el indice del arreglo para buscar un dato");
        if (!(mensaje == null || mensaje.isEmpty())) {
            try {
                int dato = Integer.parseInt(mensaje);

                if (!(dato > datoslista.size() || dato < 0)) {
                    JOptionPane.showMessageDialog(frame,
                            "EL DATO EN EL INDICE: " + dato + " es: " + datoslista.get(dato),
                            "DATO BUSCADO",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame,
                        "El indice ingresado no existe",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                        "debe ingresar solo numeros",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(frame,
                        "Campos vacios",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void Eliminar_dato(){
        String mensaje = JOptionPane.showInputDialog(frame, "ingresa el indice del arreglo para eliminar un dato");
        if (!(mensaje == null || mensaje.isEmpty())) {
            try {
                int dato = Integer.parseInt(mensaje);

                if (!(dato > datoslista.size() || dato < 0)) {
                    int respuesta = JOptionPane.showConfirmDialog(null,
                            "EL DATO EN EL INDICE: " + dato + " es: " + datoslista.get(dato) + "\n¿Desea eliminar?",
                            "DATO BUSCADO",
                            JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(frame,
                        "DATO: " + datoslista.get(dato) + " Eliminado",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                        datoslista.remove(dato);                        
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,
                        "El indice ingresado no existe",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                        "debe ingresar solo numeros",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(frame,
                        "Campos vacios",
                        "ERROR",
                        JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main_opciones() {
        JFrame frame;
        String dato;

        Object[] opciones = {
            " Ingresar nuevo dato",
            "Buscar un dato",
            "Eliminar un dato",
            "Actualizar un dato",
            "Imprimir todo el arreglo",
            "salir"};

        frame = new JFrame();
        int seleccion = JOptionPane.showOptionDialog(frame,
                "SELECCIONE UNA OPCION",
                "ESCOJA UNA OPCION",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion != 5) {
            switch (seleccion) {
                case 0:
                    dato = ingresar_dato();
                    datoslista.add(dato);
                    System.out.println(datoslista);
                    break;
                case 1:
                    buscar_dato();
                    break;
                case 2:
                    Eliminar_dato();
                    break;
                case 3:
                    ingresar_dato();
                    break;
                case 4:
                    System.out.println(datoslista);
                    mostrar_datos();
                    break;
            }
        }

        if (seleccion != 5) {
            main_opciones();
        } else {
            System.exit(0);
            System.out.println("Finalizado");
        }
    }

    public static void ejercicio_9() {
        main_opciones();
    }

    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public static void ejercicio_10 () {
    
        
        Scanner teclado = new Scanner(System.in);
        
        int rows = 10;
        int cols = 10;
        
        int [][] matriz = new int[rows][cols];
        
        System.out.println("");
        System.out.println("A continuacion, vamos a llenar la matriz. Tenga en cuenta que la primera fila y la primera columna tienen el indice de 0 (cero)");
        System.out.println("");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Ingrese el valor en la posición fila "+i+" y columna "+j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Su matriz quedó de la siguiente forma:");
        
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
    
    }
    
    public static void ejercicio_11 () {
    
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor para posición [" + i + "," + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
     
        System.out.println("Valor en posición 2,2: " + matriz[2][2]);
    
    }
    
    public static void ejercicio_13 () {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de las matrices:");
        int filas = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de las matrices:");
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] matrizResultado = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese valor para posición [" + i + "," + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese valor para posición [" + i + "," + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado de la suma de las matrices:");
        System.out.println(Arrays.deepToString(matrizResultado));
    }
    
    public static void ejercicio_14 () {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de su matriz");
        int rows = teclado.nextInt();
        
        if (rows<0) {
            System.err.println("cantidad de filas invalida");
            return;
        }        
        
        System.out.println("Ingrese la cantidad de columnas de su matriz");
        int cols = teclado.nextInt();

        if (cols<0) {
            System.err.println("cantidad de columnas invalida");
            return;
        }  
        
        int [][] matriz = new int[rows][cols];
        
        System.out.println("");
        System.out.println("A continuacion, vamos a llenar la matriz. Tenga en cuenta que la primera fila y la primera columna tienen el indice de 0 (cero)");
        System.out.println("");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Ingrese el valor en la posición fila "+i+" y columna "+j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Su matriz quedó de la siguiente forma:");
        System.out.println(Arrays.deepToString(matriz));
        
        System.out.println("Ingrese el valor a buscar");
        int num = teclado.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (matriz[i][j] == num) {
                System.out.println("Numero encontrado en la posición fila "+i+" y columna "+j);
                }
                
            }
        }

    }
    
    public static void ejercicio_15() {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de su matriz");
        int rows = teclado.nextInt();
        
        if (rows<0) {
            System.err.println("cantidad de filas invalida");
            return;
        }        
        
        System.out.println("Ingrese la cantidad de columnas de su matriz");
        int cols = teclado.nextInt();

        if (cols<0) {
            System.err.println("cantidad de columnas invalida");
            return;
        }        
        
        
        int [][] matriz = new int[rows][cols];
        
        System.out.println("");
        System.out.println("A continuacion, vamos a llenar la matriz. Tenga en cuenta que la primera fila y la primera columna tienen el indice de 0 (cero)");
        System.out.println("");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Ingrese el valor en la posición fila "+i+" y columna "+j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Su matriz quedó de la siguiente forma:");
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("");
        
        System.out.println("Ingrese la fila del valor a modificar");
        int rowTarget = teclado.nextInt();
        
        if (rowTarget>rows || rowTarget<0) {
            System.err.println("fila invalida");
            return;
        }
        
        System.out.println("Ingrese la columna del valor a modificar");
        int colTarget = teclado.nextInt();
        
        if (colTarget>cols || colTarget<0) {
            System.err.println("columna invalida");
            return;            
        }
        
        System.out.println("Ingrese el nuevo valor");
        int num = teclado.nextInt();        

        matriz[rowTarget][colTarget]=num;
        
        System.out.println("Su matriz quedó de la siguiente forma:");
        System.out.println(Arrays.deepToString(matriz));
        
        
    }
    
}
