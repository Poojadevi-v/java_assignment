import java.io.FileWriter;
class homework1{
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("HW");
            obj.write("hi iam Pooja");
            obj.close();
            System.out.println("written text");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("there is an error");
            
        }
    }
}