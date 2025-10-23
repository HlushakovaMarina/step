package L23_10_2025;

public enum Grade {
    A(5), B(4), C(3), D(2), F(1);

    private final int value;
    Grade(int value) { this.value = value; }
    public int getValue() { return value; }

}
