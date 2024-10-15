public class Funciones_EjercicioNueve {

    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 250.0, 150.0, 300.0};

        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioFinal = calcularPrecioFinal(preciosOriginales[i]);
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final: $" + precioFinal);
        }
    }

    public static double calcularPrecioFinal(double precioOriginal) {
        double descuento = 0.1; // Descuento del 10%
        double precioFinal = precioOriginal * (1 - descuento);
        return precioFinal;
    }
}

