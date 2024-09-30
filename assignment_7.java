
class Animals {
    public void show() {
        System.out.println(" are great");
    }
}

class Dogs extends Animals {
    String a = "dogs";
}

class Cats extends Animals {
    String b = "cats";
}

 class main {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
        Cats obj2 = new Cats();
        System.out.print(obj.a);
        obj.show();
        System.out.print(obj2.b);
        obj2.show();
    }
}