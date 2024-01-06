import task0.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard user1 = new CreditCard(1, 5000);
        CreditCard user2 = new CreditCard(2, 50000);
        CreditCard user3 = new CreditCard(3, 1000);

        user1.addMoney();
        user2.addMoney();
        user3.getMoney();

        user1.showInfo();
        user2.showInfo();
        user3.showInfo();
    }
}