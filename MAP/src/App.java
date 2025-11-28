import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new TreeMap<>();

        map.put("Mouse","Mouse");
        map.put("Teclado", "Teclado");
        map.put("Monitor", "Monitor");
        map.put("test", "Mause gamer");
   
        System.out.println(map);
        String data = map.get("test");
        System.out.println(data);

        boolean exist = map.containsValue("Teclado");
        System.out.println("hay un teclado? "+exist);
        map.remove("test");

        for(Map.Entry<String,String> row : map.entrySet()){
            System.out.println("La key es "+row.getKey()+" y el valor es "+row.getValue());
        }
        boolean existKey = map.containsKey("test");
        System.out.println("hay una key test? "+existKey);
    }
}
