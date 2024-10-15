public class Funciones_EjercicioSeis {
    public static void main(String[] args) {
        double[] facturas = {100.0, 250.0, 150.0, 300.0};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        double impuesto = 0.21;
        for (int i = 0; i < facturas.length; i++) {
            double montoFactura = facturas[i];
            double montoImpuesto = montoFactura * impuesto;
            System.out.println("Factura " + (i+1) + ": $" + montoFactura + " - Impuesto: $" + montoImpuesto);
        }
    }
}

