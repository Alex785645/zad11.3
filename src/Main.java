import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "mouse"));
        items.add(new Item(2, "keyboard"));
        items.add(new Item(3, "hedphones"));
        items.add(new Item(4, "phone"));
        items.add(new Item(5, "AirPods"));
        items.add(new Item(6, "speakers"));
        items.add(new Item(7, "boutle"));
        items.add(new Item(8, "camera"));
        items.add(new Item(9, "monitor"));
        items.add(new Item(9, "PC"));


        List<Item> firstFiveItems = items.subList(0, 5);

        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        for (Item item : itemSet){
            System.out.println(item);
        }


    }
}