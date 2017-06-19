public class Mp3 extends Item {
    //分级
    private String grade;
    //唱片集
    private String albums;
    //流派
    private String style;
    //比特率
    private String bitRate;
 
    public Mp3(String title, int playingTime, boolean gotIt, String comment, 
            String grade, String albums, String style, String bitRate) {
        super(title, playingTime, gotIt, comment);
        this.grade = grade;
        this.albums = albums;
        this.style = style;
        this.bitRate = bitRate;
    }
 
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
    }
    public void print() {
        System.out.print("MP3: ");
        super.print();
        System.out.println(", grade:" + grade + ", albums:" + albums +
                ", style:" + style+", bitRate:" + bitRate);
    }
}