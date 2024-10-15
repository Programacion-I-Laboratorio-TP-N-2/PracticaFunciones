public class Funciones_EjercicioDos {
    public static void main(String[] args) {

        String[] productos = {"Televisor", "Celular", "Notebook", "Auriculares", "Tablet"};
        int[] stocks = {5, 6, 1, 12, 3};

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                    System.out.println("- " + productos[i]);
            }
        }
    }
}

