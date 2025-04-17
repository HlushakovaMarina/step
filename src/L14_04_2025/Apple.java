package L14_04_2025;

public class Apple {
    private Integer weight;
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Apple() {
    }

    public Integer getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", colore=" + color +
                '}';
    }
}
