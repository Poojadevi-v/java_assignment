class parent{
    public void show(){
        System.out.println("i love animals");
    }
}
class child extends parent{
    public void show(){
        System.out.println("i hate animals");
    }
}
class main{
    public static void main(String[] args) {
        child o=new child();
        o.show();
    }
}