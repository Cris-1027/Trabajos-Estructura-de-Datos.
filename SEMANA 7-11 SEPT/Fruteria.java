import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruteriaLaCosecha {
    public static void main(String[] args) {
       
        ArrayList<String> inventarioBase = new ArrayList<>();
        inventarioBase.add("Manzana");
        inventarioBase.add("Banano");
        inventarioBase.add("Pera");
        inventarioBase.add("Uva");

        inventarioBase.add("Fresa"); 

       
        String[] proveedorArray = {"Mango", "Papaya", "Sandía"};
        List<String> listaProveedor = Arrays.asList(proveedorArray);

       
        ArrayList<String> inventarioConsolidado = new ArrayList<>(inventarioBase);
        inventarioConsolidado.addAll(listaProveedor);

       
        System.out.println("=== INVENTARIO BASE ===");
        inventarioBase.forEach(fruta -> System.out.println("- " + fruta));

        System.out.println("\n=== LISTA DEL PROVEEDOR ===");
        listaProveedor.forEach(fruta -> System.out.println("- " + fruta));

        System.out.println("\n=== INVENTARIO CONSOLIDADO ===");
        inventarioConsolidado.forEach(fruta -> System.out.println("- " + fruta));
    }
}
