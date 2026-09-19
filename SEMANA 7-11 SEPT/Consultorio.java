import java.util.ArrayList;
import java.util.ListIterator;

public class ConsultorioMedico {
    public static void main(String[] args) {
        
        ArrayList<String> fila = new ArrayList<>();
        fila.add("Carlos Pérez");
        fila.add("Ana Gómez");
        fila.add("Luis Torres");
        fila.add("Sofía Rincón");
        fila.add("Mateo Díaz");

       
        System.out.println("=== REPORTE DE POSICIONES (ORDEN DE LLEGADA) ===");
        ListIterator<String> iterador = fila.listIterator();
        while (iterador.hasNext()) {
            int posicion = iterador.nextIndex() + 1;
            String paciente = iterador.next();
            System.out.println("Posición " + posicion + ": " + paciente);
        }

      
        System.out.println("\n=== REPORTE INVERSO (MÁS RECIENTES PRIMERO) ===");
        while (iterador.hasPrevious()) {
            String paciente = iterador.previous();
            System.out.println("- " + paciente);
        }

       
        iterador = fila.listIterator();
        iterador.next(); // Pasa al paciente 1
        iterador.next(); // Pasa al paciente 2
        
       
        iterador.add("PACIENTE DE URGENCIAS");

       
        System.out.println("\n=== FILA FINAL CON URGENCIAS ===");
        fila.forEach(paciente -> System.out.println("- " + paciente));

       
    }
}
