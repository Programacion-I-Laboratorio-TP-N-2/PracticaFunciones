public class Funciones_EjercicioOcho {
    public static void main(String[] args) {

        String[] empleados = {"Veronica", "Laura", "Carlos", "Juan"};
        int[] horasTrabajadas = {40, 45, 35, 40};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double salarioPorHora = 15.0;

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * salarioPorHora;
            System.out.println(empleados[i] + " trabajó " + horasTrabajadas[i] + " horas y su pago semanal es de $" + pagoSemanal);
        }
    }
}

