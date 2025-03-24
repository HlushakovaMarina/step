package L24_03_2025;

public enum DayOfWeek {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);
    private final String russianName;
    private final int numDayOfWeek;

    DayOfWeek(String russianName, int numDayOfWeek) {
        this.russianName = russianName;
        this.numDayOfWeek = numDayOfWeek;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getNumDayOfWeek() {
        return numDayOfWeek;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "russianName='" + russianName + '\'' +
                ", numDayOfWeek=" + numDayOfWeek +
                '}';
    }
}
