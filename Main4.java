import java.io.FileWriter;
public class Main4{
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("test.txt");
            for(int i=0;i<11;i++){
                obj.write(i+"\n");
            }
            obj.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("there is an error");
        }
    }
}