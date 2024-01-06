import task0.CreditCard;
import task1.Computer;
import task1.HDD;
import task1.RAM;

public class Main {
    public static void main(String[] args) {
       /* CreditCard user1 = new CreditCard(1, 5000);
        CreditCard user2 = new CreditCard(2, 50000);
        CreditCard user3 = new CreditCard(3, 1000);

        user1.addMoney();
        user2.addMoney();
        user3.getMoney();

        user1.showInfo();
        user2.showInfo();
        user3.showInfo();
        */

        Computer pc1 = new Computer("MSI", 2000);
        Computer pc2 = new Computer("Asus", 5000, new RAM("Samsung", 32), new HDD("Seagate", "Внешний", 512));

        pc1.showInfo();
        pc2.showInfo();
    }
}