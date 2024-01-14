package task1;

import java.util.Objects;

/*
Создать класс для описания компьютера, а в этом классе должны быть поля: стоимость,
модель(строковый типа) RAM и HDD.
Для полей RAM и HDD следует создать свое собственные классы.
Классы RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
Класс RAM имеет поля - название и объем.
Класс HDD имеет поля - название, объем и тип(внешний или внутренний).
Класс Computer молжен иметь два конструктора
 - первый - с параметрами стоимость и модель
 - второй - со всеми полями
При создание объекта компьютер с помощью первого конструктора должны создаваться поля RAM и HDD
с помощью конструктора по умолчанию
В каждом из классов предусмотреть методы для вывода полной информации(вывод всех полей и значений)
Тестовый сценарий для проверки:
 - создать объект компьютер1 с помощью первого конструктора и вывести информацию на экран
 - создать объект компьютер2 с помощью второго конструктора и вывести информацию на экран
 */
public class Computer {

    String model;
    int cost;
    HDD hdd;
    RAM ram;

    public Computer(String model, int cost) {
        this.cost = cost;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(String model, int cost, RAM ram ,HDD hdd ) {
        this.model = model;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void showInfo() {
        System.out.println("Название " + hdd.name + " Объем " + hdd.memory + " Тип " + hdd.type);
        System.out.println("Название " + ram.name + " Объем " + ram.memory);
        System.out.println("Модель: " + model + " Цена " + cost);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}
