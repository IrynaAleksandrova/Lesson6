package task2;

public class Computer {
    private int cost;
    private String model;
    RAM ram = new RAM();
    HDD hdd = new HDD();

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String informationComputer() {
        return "Computer cost: " + this.cost + "; model: " + this.model + "; " + ram.informationRAM()
                + "; " + hdd.informationHDD();
    }
}
