import java.io.File;
public class Main3{
    public static void main(String[] args) {
        try {
            File test = new File("test.txt");
            if(test.createNewFile()){
                System.out.println("file created succesfully");
            }
            else{
                System.out.println("file alreday exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("there is an error");
        }
    }
}