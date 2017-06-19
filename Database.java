import java.util.ArrayList;
 
public class Database {
 
    private ArrayList<Item> listItem = new ArrayList<Item>();
     
    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
        for( Item item : listItem){
            item.print();
        }
    }
    public static void main(String[] args) {
        Database db = new Database();
        db.add(new Mp3("突然之间", 5, false, "精品合集", "R", "突然之间", "Pop","1200bpd"));
        db.list();
    }
}