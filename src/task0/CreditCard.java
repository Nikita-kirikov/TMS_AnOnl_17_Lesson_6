package task0;
/*
Создать метод CreditCard с полями номер счета и текущая сумма на счете.
Добавить метод, который позволяет начислить сумму на кредитную карту.
Добавить метод, который позволяет снимать с карточки некую сумму.
Добавить метод, который выводит на экран текущую информацию о карточке.
Написать программу, которая создает три объекта класса CreditCard у котоых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки:
 - положите деньги на первые две карточки и снимите с третьей.
 - Выведите на экран текущее состояние всех вех трех карточек.
 */

import java.util.Scanner;

public class CreditCard {

    int id;
    int currentMoney;

    public CreditCard(int id, int money) {
        this.id = id;
        this.currentMoney = money;
    }

    public void addMoney(int input) {
        currentMoney += input;
    }

    public void getMoney(int input) {
        if (input <= currentMoney) {
            System.out.println("Вы сняли " + input);
            currentMoney -= input;
        } else {
            System.out.println("Введеная сумма превышает сумму на карте");
        }
    }

    public void showInfo() {
        System.out.println("Ваш счет " + id + " Сумма на счете равна " + currentMoney);
    }


}
