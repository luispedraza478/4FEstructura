import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
                                //Hashset
                                //treeset para orden alfabetico
                                //LinkedHash                    
        Set <String> Set = new TreeSet<>();
        Set.add("Azul");
        Set.add("Verde");
        Set.add("Rojo");
        Set.add("Amarillo");
        Set.add("Rojo");

        System.out.println(Set);
        boolean existeRojo = Set.contains("Rojo");
        System.out.println("Existe el rojo? "+existeRojo);

        Set.remove("Verde");
        int tam=Set.size();
        for(String data:Set){
            System.out.println("Dato " + data);
        }
         System.out.println("El tamaña actual es: "+tam);
    }
}
