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
        db.add(new Mp3("ͻȻ֮��", 5, false, "��Ʒ�ϼ�", "R", "ͻȻ֮��", "Pop","1200bpd"));
        db.list();
    }
}