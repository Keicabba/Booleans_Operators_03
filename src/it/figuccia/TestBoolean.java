package it.figuccia;

public class TestBoolean {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        boolean a = !(!(!(false ^ false) || (true && true)));
        boolean b = !((x * y) <= 6) && (x - y != 1);
        System.out.println("[A]: " + a);
        System.out.println("[B]: " + b);
    }
}
