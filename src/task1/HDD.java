package task1;

public class HDD {

    public String name = "WD";
    public String type = "Внутренний";
    public int memory = 1000;


    public HDD(String name, String type, int memory) {
        this.memory = memory;
        this.name = name;
        this.type = type;
    }

    public HDD() {

    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", memory=" + memory +
                '}';
    }
}
