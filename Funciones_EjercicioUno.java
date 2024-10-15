import java.util.Scanner;

public class Funciones_EjercicioUno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Ingrese el número de días: ");
            int numDias = scanner.nextInt();


            double[] ventas = new double[numDias];


            for (int i = 0; i < numDias; i++) {
                System.out.print("Ingrese la venta del día " + (i+1) + ": ");
                ventas[i] = scanner.nextDouble();
            }


            double ingresosTotales = calcularIngresosMensuales(ventas);
            System.out.println("Los ingresos totales mensuales son: $" + ingresosTotales);
        }


        public static double calcularIngresosMensuales(double[] ventas) {
            double total = 0;
            for (double venta : ventas) {
                total += venta;
            }
            return total;
        }
}