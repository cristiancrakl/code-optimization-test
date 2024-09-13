import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        // inicializar el Scanner
        Scanner scanner = new Scanner(System.in);

        // constatntes para la tasa impositiva
        final int TAX_THRESHOLD = 50;
        final double TAX_RATE_LOW = 0.10;
        final double TAX_RATE_HIGH = 0.15;

        //constantes para los precios
        final int productPrice1=100;
        final int productPrice2=200;
        

        //operaciones respectivas
        double tax1 = (productPrice1 * TAX_RATE_HIGH);
        double tax2 = (productPrice2 * TAX_RATE_LOW);
        double totalTax = (tax1 + tax2);

        
        
        
        // arrays para manejar multiples productos y sus respectivas tasas impositivas Esto no hace nadaXD
        String vector1[] = new String[5];

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese el nombre de el producto " + i);
            vector1[i] = scanner.nextLine();
        }

       
        
        
        
        
        
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
