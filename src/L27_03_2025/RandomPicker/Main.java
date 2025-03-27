package L27_03_2025.RandomPicker;

public class Main {
    public static void main(String[] args) {
        LotteryMachine<String> lotto = new LotteryMachine<>();

        // Добавляем участников
        lotto.add("Катя");
        lotto.add("Олег");
        lotto.add("Аня");
        lotto.add("Петя");
        lotto.add("Саша");

        System.out.println("🎰 Первый розыгрыш:");
        String name;
        while ((name = lotto.pick()) != null) {
            System.out.println("Выбран: " + name);
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((name = lotto.pick()) != null) {
            System.out.println("Снова выбран: " + name);
        }
    }

}

