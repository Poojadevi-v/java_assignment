class calculator{

    public void add(int a,int b){

        System.out.println("a+b is :"+(a+b));
    }
    public void add(int a,int b,int c){

        System.out.println("a+b+c is:"+(a+b+c));
    }
    public void add(double e,double f){
        System.out.println("e+f is :"+(e+f));
    }

}
class sum extends calculator{
    public static void main(String[] args) {
        sum obj=new sum();
        obj.add( 5, 8);
    }
}
