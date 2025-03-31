package L31_03_2025.RandomPicker;

import L31_03_2025.RandomPicker.exception.DuplicateParticipantException;
import L31_03_2025.RandomPicker.exception.MaxWinnersExceededException;
import L31_03_2025.RandomPicker.exception.UnderageException;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new ArrayDeque<>();
    private Set<T> winners = new HashSet<>();
    private boolean initialized;
    private final int MAX_WINNERS = 2;

    public void add(T item) throws UnderageException, DuplicateParticipantException {
        if (initialized) {
            return;
        }
        if (item.getAge() < 18){
            throw new UnderageException("Участнику нет 18");
        }
        if(allItems.contains(item.getPassportId())){
            throw new DuplicateParticipantException("Участник с таким паспортом уже существует")
        }
        allItems.add(item);
    }

    public void init() {
        if (!initialized) {
            return;
        }
        List<T> eligibleParticipants = new ArrayList<>(allItems);
        Collections.shuffle(eligibleParticipants);
        queue.addAll(eligibleParticipants);
        initialized = true;
    }

    public T pick() throws MaxWinnersExceededException {
        if (!initialized) {
            init();
        }
        if (queue.isEmpty()) {
            return null;
        }
        if (winners.size() >= MAX_WINNERS) {
            throw new MaxWinnersExceededException("Количество победителей превысило лимит");
        }

//        return queue.poll(); задача 1
        T winner = queue.poll();
        allItems.remove(winner);
        winners.add(winner);
        return winner;
    }

    public void reset() {
        List<T> eligibleParticipants = new ArrayList<>(allItems);
        eligibleParticipants.removeAll(winners);
        if (eligibleParticipants.isEmpty()) {
            winners.clear();
            eligibleParticipants.addAll(allItems);
        }
        Collections.shuffle(eligibleParticipants);
        queue.clear();
        queue.addAll(eligibleParticipants);
        init();
    }

    public int remaining() {
        return queue.size();
    }

    public Map<String, Integer> ageToWinners() {
        Map<String, Integer> ageToCount = new HashMap<>();
        ageToCount.put("18-30", 0);
        ageToCount.put("30-50", 0);
        ageToCount.put("50+", 0);

        for (Participant winner : winners) {
            int age = winner.getAge();
            if (age >= 18 && age <= 30) {
                ageToCount.put("18-30", ageToCount.get("18-30") + 1);
            } else if (age > 30 && age <= 50) {
                ageToCount.put("30-50", ageToCount.get("30-50") + 1);
            } else {
                ageToCount.put("50+", ageToCount.get("50+") + 1);
            }
        }
        return ageToCount;
    }

    public Map<Sex, Integer> sexToWinnersCount() {
        Map<Sex, Integer> sexToCount = new HashMap<>();
        sexToCount.put(Sex.MALE, 0);
        sexToCount.put(Sex.FEMALE, 0);
        for (Participant winner : winners) {
            Sex sex = winner.getSex();
            sexToCount.put(sex, sexToCount.get(sex) + 1);
        }
        return sexToCount;
    }
}




