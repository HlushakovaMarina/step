package L24_03_2025;

import java.util.EnumMap;
import java.util.EnumSet;

public class Task00 {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        String russianName = friday.getRussianName();
        System.out.println(russianName);
//        test(friday);
        for (DayOfWeek value : DayOfWeek.values()){
            System.out.println(value.getRussianName());
        }
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println(monday);
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.MONDAY,
                DayOfWeek.WEDNESDAY);
        EnumMap<DayOfWeek, Integer> dayOfWeekIntegerEnumMap = new EnumMap<>(DayOfWeek.class);
    }

    private static void test(DayOfWeek dayOfWeek) {
        if (DayOfWeek.FRIDAY == dayOfWeek) {
            System.out.println("Ура пятница");
        }

    }

}
