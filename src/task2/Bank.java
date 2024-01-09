package task2;

import java.util.Scanner;
/*
Создать класс, описывающий банкомат
Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
количество купюр номиналом 20 50 100
Сделать метод для добавления денег в банк
Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение
- успешность выполнения операции
При снятии денег функция должна расспечатывать каким количеством купюр какого номинала выдается сумма
Создать конструктор с тремя параметрами - количество купюр каждого номинала
 */
public class Bank {

    int count20Rub;
    int banknote20 = 20;
    int count50Rub;
    int banknote50 = 50;
    int count100Rub;
    int banknote100 = 100;
    int sum = 0;
    boolean isSuccess = false;

    int[] countBanknote = new int[3];

    Scanner scan = new Scanner(System.in);

    public Bank(int count20Rub, int count50Rub, int count100Rub) {
        this.count20Rub = count20Rub;
        this.count50Rub = count50Rub;
        this.count100Rub = count100Rub;
    }

    public void addMoney(int input) {
        for (int i = 0; i < input; i++) {
            input -= 20;
            count20Rub++;
        }
        System.out.println(count20Rub);
    }

    public boolean getMoney(int input) {
        sum += (count20Rub * banknote20) + (count50Rub * banknote50) + (count100Rub * banknote100);
        int s = input;

        if (input <= sum && input != 0) {
            countBanknote[0] = input / 100;
            countBanknote[1] = (input % 100) / 50;
            countBanknote[2] = ((input % 100) % 50) / 20;
            sum -= input;
            input -= banknote100 * countBanknote[0] + banknote50 * countBanknote[1] + banknote20 * countBanknote[2];

            if(input != 0) return false;

            isSuccess = true;
            System.out.println("Ваша сумма " + s + " будет выдана, как " + countBanknote[0] + " " + countBanknote[1] + " " + countBanknote[2]);
        } else {
            System.out.println("Невозможно выдать данную сумму");
            isSuccess = false;
        }
        return isSuccess;
    }
}
