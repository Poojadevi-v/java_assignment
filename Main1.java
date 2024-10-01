import java.io.FileWriter;
public class Main1{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("File.txt");
            writer.write("Hello world!");
            writer.close();
            System.out.println("Written succesfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("an error has occured");
        }
    }
}