package L23_10_2025;

public enum LessonType {
    LECTURE("Лекция"),
    PRACTICE("Практика"),
    LAB("Лабораторная");

    private final String displayName;
    LessonType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
