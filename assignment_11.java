/*Dynamic dispatch*/
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
        parent o=new child();
        o.show();
    }
}