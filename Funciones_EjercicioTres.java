public class Funciones_EjercicioTres {
    public static void main(String[] args) {

        String[] clientes = {"Juan Lopez", "Claudia Martinez", "Carlos Gimenez", "Pedro Rodríguez"};
        int[] facturasPendientes = {450, 600, 320, 800};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, int[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println("- " + clientes[i]);
            }
        }
    }
}

