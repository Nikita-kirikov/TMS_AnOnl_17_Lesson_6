package task1;

public class RAM {

    public int memory = 16;
    public String name = "DRAM";

    public RAM(String name, int memory) {
        this.memory = memory;
        this.name = name;
    }

    public RAM() {

    }

    public void showInfo() {
        System.out.println("Название " + name + " Объем " + memory);
    }

}
