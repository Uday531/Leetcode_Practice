package day64;

public class Card implements Payment{
    @Override
    public void pay() {
        System.out.println("paid using card");
    }
}
