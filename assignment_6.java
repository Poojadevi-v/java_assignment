


class friend {
    String a = "Haritha";

    void show() {
        System.out.println(a);
    }
}
    class b extends friend{
        public static void main(String[] args) {
            b obj = new b();
            obj.show();
        }
    }
