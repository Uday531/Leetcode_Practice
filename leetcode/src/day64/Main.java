package day64;

public class Main {
    static void main() {
        Payment p1=new UPI();
        Payment p2=new Card();
        p1.pay();
        p2.pay();
    }
}
