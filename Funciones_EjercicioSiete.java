public class Funciones_EjercicioSiete {
    public static void main(String[] args) {

        double[] compras = {400.0, 600.0, 350.0, 800.0};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        double descuento = 0.15;
        double montoMinimoDescuento = 500.0;

        for (int i = 0; i < compras.length; i++) {
            double montoCompra = compras[i];
            if (montoCompra > montoMinimoDescuento) {
                double descuentoAplicado = montoCompra * descuento;
                double totalAPagar = montoCompra - descuentoAplicado;
                System.out.println("Compra: $" + montoCompra + " - Descuento: $" + descuentoAplicado + " - Total a pagar: $" + totalAPagar);
            } else {
                System.out.println("Compra: $" + montoCompra + " - No aplica descuento.");
            }
        }
    }
}

