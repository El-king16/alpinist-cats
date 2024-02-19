package CatAndMouse;
public class Cat extends Mouse {
    private String name;
    private int weight;
    private int total;

    public Cat(int speed, String name, int weight, int total) {
        super(speed);
        this.name = name;
        this.weight = weight;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
