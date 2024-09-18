import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        // declaro el scanner
        Scanner scanner = new Scanner(System.in);

        // cambio el nombre a las variables
        final int Precio_Producto1 = 15;
        final int Precio_Producto2 = 10;
        final int Precio_Producto3 = 5;

        // declaro las ventas hechas y asi
        final int Cantidad_Ventas_Producto1 = 2;
        final int Cantidad_Ventas_Producto2 = 3;
        final int Cantidad_Ventas_Producto3 = 4;

        // Declarar la matriz e ingresar datos de ventas y su precio
        int[][] Matriz_Cantidad_Ventas = new int[5][2];

        for (int f = 0; f < Matriz_Cantidad_Ventas.length; f++) {

            for (int c = 0; c < Matriz_Cantidad_Ventas.length; c++) {

                System.out.println("ingrese la cantidad de ventas del producto: " + f);
                Matriz_Cantidad_Ventas[f][c] = scanner.nextInt();

            }

        }

        // recorrer e imprimir la matriz anterior
        for (int f = 0; f < Matriz_Cantidad_Ventas.length; f++) {
            for (int c = 0; c < Matriz_Cantidad_Ventas.length; c++) {
                System.out.println(Matriz_Cantidad_Ventas[f][c]);
            }
        }

        int Total_Vendido_Producto1 = (Precio_Producto1 * Cantidad_Ventas_Producto1);
        int Total_Vendido_Producto2 = (Precio_Producto2 * Cantidad_Ventas_Producto2);
        int Total_Vendido_Producto3 = (Precio_Producto3 * Cantidad_Ventas_Producto3);

        int Total_De_ventas = Total_Vendido_Producto1 + Total_Vendido_Producto2 + Total_Vendido_Producto3;

        if (Total_De_ventas > 50) {
            System.out.println("El Rendimiento del total de ventas fue alto");
        } else {
            System.out.println("El rendimiento del total de ventas fue bajo");
        }
    }
}
