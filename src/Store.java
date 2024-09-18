public class Store {
    public static void main(String[] args) {
        

        //cambio el nombre a las variables 
        final int Precio_Producto1 = 15;
        final int Precio_Producto2 = 10;
        final int Precio_Producto3 = 5;

       
       
       
       
       
       
       
        int total1 = Precio_Producto1 * 2;
        int total2 = Precio_Producto2 * 3;
        int total3 = Precio_Producto3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
