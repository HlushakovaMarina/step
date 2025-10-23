package L23_10_2025;

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = UniversityFactory.createSampleUniversity();

        System.out.println("=== Университет ===");
        System.out.println(uni);

        System.out.println("\n=== Группы ===");
        uni.getGroups().forEach(System.out::println);


    }
}
