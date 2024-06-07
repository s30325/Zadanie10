import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> przedmioty = new ArrayList<>();
        przedmioty.add(new Item(2, "pilka"));
        przedmioty.add(new Item(3, "donica"));
        przedmioty.add(new Item(4, "but"));
        przedmioty.add(new Item(5, "kasztan"));
        przedmioty.add(new Item(6, "butla"));

        for(int i = 0; i < przedmioty.size(); i++){
            przedmioty.get(i).show();
        }
        HashMap<Integer, String> map = new HashMap<>();
        for (Item item : przedmioty){
            map.put(item.identyfikator, item.nazwa);
        }
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("identyfikator: " + e.getKey() + "  Nazwa: " + e.getValue());
        }
        ArrayList<Item> przedmioty2 = new ArrayList<>();
            przedmioty2.add(new Item(7, "d"));
            przedmioty2.add(new Item(8, "f"));
            przedmioty2.add(new Item(9, "g"));
            przedmioty2.add(new Item(10, "h"));
            przedmioty2.add(new Item(11, "j"));
            przedmioty2.add(new Item(12, "k"));
            przedmioty2.add(new Item(13, "y"));
            przedmioty2.add(new Item(14, "u"));
            przedmioty2.add(new Item(15, "i"));
            przedmioty2.add(new Item(16, "b"));

            List<Item> przedmioty3 = przedmioty2.subList(0, 4);
        HashSet<Item> itemsSet = new HashSet<>();
        for(Item item : przedmioty3){
            itemsSet.add(item);
        }


    }
}