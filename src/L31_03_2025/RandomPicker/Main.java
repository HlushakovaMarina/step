package L31_03_2025.RandomPicker;

import L31_03_2025.RandomPicker.exception.DuplicateParticipantException;
import L31_03_2025.RandomPicker.exception.MaxWinnersExceededException;
import L31_03_2025.RandomPicker.exception.NotInitializedException;
import L31_03_2025.RandomPicker.exception.UnderageException;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DuplicateParticipantException, UnderageException {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        Scanner scanner = new Scanner(System.in);

        try {
            lotto.reset();
        } catch (NotInitializedException e) {
            System.err.println("Ошибка при вызове reset() до init(): " + e.getMessage());
        }

        try {
            lotto.add(ParticipantFactory.createParticipant("Катя", 25, "Female", "BM1234567"));
            lotto.add(ParticipantFactory.createParticipant("Олег", 38, "Male", "BM6789012"));
            lotto.add(ParticipantFactory.createParticipant("Аня", 17, "Female", "BM9345678"));
            lotto.add(ParticipantFactory.createParticipant("Петр", 45, "Male", "BM2901234"));
            lotto.add(ParticipantFactory.createParticipant("Катя", 25, "Female", "BM7567890"));
        } catch (UnderageException e) {
            System.err.println("Ошибка при добавлении участника: " + e.getMessage());
        } catch (DuplicateParticipantException e) {
            System.err.println("Ошибка при добавлении участника: " + e.getMessage());
        }

        lotto.init();
        try {
            System.out.println("\nВыбираем победителей:");
            for (int i = 0; i < 5; i++) {
                Participant winner = lotto.pick();
                if (winner != null) {
                    System.out.println("Победитель " + (i + 1) + ": " + winner);
                } else {
                    System.out.println("Больше нет участников.");
                    break;
                }
            }
        } catch (MaxWinnersExceededException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            lotto.getWinners(); // Установим лимит победителей
            System.out.println("\nНачинаем розыгрыш!");

            while (true) {
                try {
                    Participant winner = lotto.pick();
                    if (winner != null) {
                        System.out.println("Победитель: " + winner);
                    } else {
                        break;
                    }
                } catch (MaxWinnersExceededException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                    break;
                }
            }

//        System.out.println("🎰 Первый розыгрыш:");
//        Participant participant;
//        while ((participant = lotto.pick()) != null) {
//            System.out.println("Выбран: " + participant);
//        }

//        System.out.println("\n🔁 Новый розыгрыш:");
//        lotto.reset();
//        while ((participant = lotto.pick()) != null) {
//            System.out.println("Снова выбран: " + participant);
//        }
            System.out.println("\nСписок победителей:");
            for (Participant winner : lotto.getWinners()) {
                System.out.println(winner);
            }
            System.out.println("\n📊 Статистика победителей по возрасту:");
            System.out.println(lotto.ageToWinners());

            System.out.println("\n📊 Статистика победителей по полу:");
            System.out.println(lotto.sexToWinnersCount());

            lotto.reset();
            System.out.println("\nРозыгрыш сброшен.");

        } catch (NotInitializedException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

