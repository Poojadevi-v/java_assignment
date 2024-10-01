import java.io.File;
public class Main {
    public static void main(String[] args) {
   try{
    File obj = new File("File.txt");
    if(obj.createNewFile()){
        System.out.println("file created succesfully");
    }
    else{
        System.out.println("file already exists");
    }}
    catch(Exception e){
        System.out.println("an error occured");
        e.printStackTrace();
    }
   }
}