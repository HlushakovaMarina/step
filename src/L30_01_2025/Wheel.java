package L30_01_2025;

public class Wheel {
    String type;
    int diameter;
    String material;

    public Wheel(String type, int diameter, String material) {
        this.type = type;
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
