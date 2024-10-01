import java.util.Scanner;
public class Main2{
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner("file.txt");
            while(Reader.hasNextLine()){
                String data = Reader.nextLine(obj);
                System.out.println(data);
               }
                Reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error occured");
        }
    }
}