package Voencomat;

import java.util.Random;

public class RecruitGenerator {
    private String[] firstNames = {"Иван", "Петр", "Сергей", "Александр", "Дмитрий"};
    private String[] middleNames = {"Иванович", "Петрович", "Сергеевич", "Александрович", "Дмитриевич"};
    private String[] lastNames = {"Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецов"};
    private Random random = new Random();

    public Recruit generate() {
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String middleName = middleNames[random.nextInt(middleNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        double visionCoeff = 0.5 + random.nextDouble();
        boolean flatFeet = random.nextBoolean();
        int implantCount = random.nextInt(5);
        int cardiogram = 40 + random.nextInt(80);
        return new Recruit(firstName, middleName, lastName, visionCoeff, flatFeet, implantCount, cardiogram);
    }

}
