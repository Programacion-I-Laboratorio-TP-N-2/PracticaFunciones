public class Funciones_EjercicioCinco {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 2, 5, 4, 1};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        if (calificaciones.length == 0) {
            return 0;
        } else {
            return (double) suma / calificaciones.length;
        }
    }
}

