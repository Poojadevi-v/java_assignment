interface stress {
    public void Problems();
}
interface peace{
    public void solution();
}

class chill implements stress,peace {

    public void Problems() {
        System.out.println("the problem is :over work");
    }

    public void solution() {
        System.out.println("the solution is:enough sleep");
    }

    public static void main(String[] args) {
        chill ice = new chill();
        ice.Problems();
        ice.solution();
    }
}
}