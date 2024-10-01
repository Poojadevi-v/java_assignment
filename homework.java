import java.io.File;
class homework{
    public static void main(String[] args) {
        try {
              File obj = new File("HW");
        if(obj.createNewFile()){
            System.out.println("File cretaed successfully");
        }
        else{
            System.out.println("File already exsists");
        }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("an error has occured");
        }
      
    }
}