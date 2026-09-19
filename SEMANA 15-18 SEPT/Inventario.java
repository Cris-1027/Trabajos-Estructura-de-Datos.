import java.util.ArrayList;
import java.util.Arrays;

public class InventarioTienda {
    public static void main(String[] args) {
       
        ArrayList<String> inventarioBase = new ArrayList<>();
        inventarioBase.add("Laptop");
        inventarioBase.add("Mouse");
        inventarioBase.add("Teclado");
        inventarioBase.add("Monitor");

       
        String[] productosProveedor = {
            "Audífonos",
            "Memoria USB",
            "Disco Duro"
        };

       
        ArrayList<String> inventarioConsolidado = new ArrayList<>(inventarioBase);
        inventarioConsolidado.addAll(Arrays.asList(productosProveedor));

        
        System.out.println("=== INVENTARIO CONSOLIDADO (Total: " + inventarioConsolidado.size() + ") ===");
        for (String producto : inventarioConsolidado) {
            System.out.println("- " + producto);
        }
    }
}
