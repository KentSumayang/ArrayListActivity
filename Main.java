import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.ArrayList;



public class Main{

    public static void main(String[] args) {
        

        // List<Integer> numbersList = new ArrayList<Integer>();
        // numbersList.add(30);
        // numbersList.add(20);
        // numbersList.add(10);
        // numbersList.add(0);

        
        // System.out.println(numbersList.size());
        // for(int i = 0; i<numbersList.size(); i++){
        //     System.out.println(numbersList.get(i));
        // }
        
        // // Iterator<Integer> it = numbersList.iterator();
        // // while(it.hasNext()); {
        // //     System.out.println(it.next());
        // // }

        // List <String> names = new LinkedList<String>();
        // names.add("Hirai Momo");
        // names.add("Son Chae-young");
        // names.add("Park Ji-hyo");
        // names.add("Im Na-yeon");

        // Stream<String> str = names.stream();
        // str.forEach(name ->{
        //     System.out.println("Twice Member " + name);
        // });
        
        // Set <Integer> set = new HashSet<Integer>();
        // set.add(10);
        // set.add(20);
        // set.add(30);
        // set.add(40);
        // set.add(50);

        
        // Iterator<Integer> it = set.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // Set <Integer> set = new TreeSet<Integer>();
        // set.add(10);
        // set.add(20);
        // set.add(30);
        // set.add(40);
        // set.add(50);

        
        // Iterator<Integer> it = set.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }
        
        // Map<Integer,String> hashmap = new HashMap<Integer,String>();

        // hashmap.put(0, "Ryujin");
        // hashmap.put(1, "Lia");
        // hashmap.put(2, "Yuna");
        // hashmap.put(3, "Chaeryoung");
        // hashmap.put(4, "Yeji");
        

        // //make keyset
        // Set<Integer> keys = hashmap.keySet();

        // //display value
        // Iterator<Integer> it = keys.iterator();
        // while(it.hasNext()){
        //     System.out.println(hashmap.get(it.next()));

        // }

        Map<String,String> profile = new TreeMap<>();
        profile.put("Name", "Kent Sumayang");
        profile.put("Age", "20yo");
        profile.put("Address", "Mars");

        Set<String> keys = profile.keySet();
        
        for(String key : keys){
            System.out.println("Key= "+ key);
        }


        System.out.println("I am "+profile.get("Name"));
        System.out.println("I am "+profile.get("Age"));
        System.out.println("I live in "+profile.get("Address"));



        }
        
}