import task0.CreditCard;
import task1.*;
import task2.Bank;

public class Main {
    public static void main(String[] args) {

        CreditCard user1 = new CreditCard(1, 5000);
        CreditCard user2 = new CreditCard(2, 50000);
        CreditCard user3 = new CreditCard(3, 1000);

        user1.addMoney(500);
        user2.addMoney(300);
        user3.getMoney(200);

        user1.showInfo();
        user2.showInfo();
        user3.showInfo();

        Computer pc1 = new Computer("MSI", 2000);
        Computer pc2 = new Computer("Asus", 5000, new RAM("Samsung", 32), new HDD("Seagate", "Внешний", 512));

        System.out.println(pc1.toString());
        System.out.println(pc2.toString());


        Bank bank = new Bank(10,10,10);
        bank.addMoney(100);
        System.out.println(bank.getMoney(250));
    }
}