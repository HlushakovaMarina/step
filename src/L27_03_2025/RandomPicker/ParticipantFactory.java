package L27_03_2025.RandomPicker;

public class ParticipantFactory {
    public static Participant createParticipant(String name, int age, String sexStr, String passportId) {
        Sex sex = Sex.valueOf(sexStr);
        return new Participant(name, age, sex, passportId);
    }

    private ParticipantFactory() {
    }
}
