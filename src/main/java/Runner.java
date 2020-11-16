import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap();
        hashmap.put("1", "123");
        hashmap.put("1", "321");
        System.out.println(hashmap);
        System.out.println(hashmap.keySet());
        System.out.println("Module#1");

        HashMap<Integer, String> passportsAndNames = new HashMap();


        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);
    }
}
