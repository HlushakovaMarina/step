package L31_03_2025.RandomPicker;

public class Main {
    public static void main(String[] args) {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();

        // Добавляем участников
        lotto.add(ParticipantFactory.createParticipant("Катя", 25, "Female", "BM1234567"));
        lotto.add(ParticipantFactory.createParticipant("Олег", 38, "Male", "BM6789012"));
        lotto.add(ParticipantFactory.createParticipant("Аня", 17, "Female", "BM9345678"));
        lotto.add(ParticipantFactory.createParticipant("Петр", 45, "Male", "BM2901234"));
        lotto.add(ParticipantFactory.createParticipant("Катя", 25, "Female", "BM7567890"));

        System.out.println("🎰 Первый розыгрыш:");
        Participant participant;
        while ((participant = lotto.pick()) != null) {
            System.out.println("Выбран: " + participant);
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((participant = lotto.pick()) != null) {
            System.out.println("Снова выбран: " + participant);
        }
        System.out.println("\n📊 Статистика победителей по возрасту:");
        System.out.println(lotto.ageToWinners());

        System.out.println("\n📊 Статистика победителей по полу:");
        System.out.println(lotto.sexToWinnersCount());
    }

}

