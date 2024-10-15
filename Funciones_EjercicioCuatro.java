public class Funciones_EjercicioCuatro {
    public static void main(String[] args) {

        String[] clientes = {"Juan Lopez", "Claudia Martinez", "Carlos Gimenez", "Pedro Rodríguez"};
        int[] ventas= {450, 600, 320, 800};
        int[] compras = {8, 12, 5, 15};

        calcularDescuentos(clientes, compras, ventas);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras, int[] ventas) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double descuento = ventas[i] * 0.1; // 10% de descuento
                System.out.println(clientes[i] + " tiene un descuento de $" + descuento);
            }
        }
    }
}

