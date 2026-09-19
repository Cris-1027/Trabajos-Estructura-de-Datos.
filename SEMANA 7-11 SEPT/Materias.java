import java.util.ArrayList;
import java.util.ListIterator;

public class DepuracionMaterias {
    public static void main(String[] args) {
       
        ArrayList<String> materias = new ArrayList<>();
        materias.add("Matemáticas Discretas");
        materias.add("Piloto de Redes");
        materias.add("Programación Orientada a Objetos");
        materias.add("Piloto de Bases de Datos");
        materias.add("Estructuras de Datos");

        System.out.println("=== REVISANDO Y DEPURANDO MATERIAS ===");
        
       
        ListIterator<String> iterador = materias.listIterator();
        while (iterador.hasNext()) {
            String materiaActual = iterador.next();
            System.out.println("Revisando: " + materiaActual);
            
            if (materiaActual.startsWith("Piloto")) {
                iterador.remove(); 
                System.out.println(" -> Eliminada del sistema.");
            }
        }

       
        System.out.println("\n=== LISTA FINAL DEPURADA ===");
        materias.forEach(materia -> System.out.println("- " + materia));
    }
}
