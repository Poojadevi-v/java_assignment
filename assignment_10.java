
interface sum{
    public void add();
}
interface subract{
    public void difference();
}
class ans implements sum,subract{
    int a=6;
    int b=5;
    public void add(){
        System.out.println("sum is :"+(a+b));
    }
    public void difference(){
        System.out.println("difference is :"+(a-b));
    }
    public static void main(String[] args) {
        ans obj=new ans();
        obj.add();
        obj.difference();
    }
}