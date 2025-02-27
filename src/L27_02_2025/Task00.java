package L27_02_2025;

public class Task00 {
    public static void main(String[] args) {
        User user1 = new User("Мариана", 25);
        User user2 = new User("Ира", 32);
        System.out.println("user2.equals(user1) -> " + user2.equals(user1));
        System.out.println("user2==user1 -> " + (user2 == user1));

        System.out.println("user2 hashCode -> " + user2.hashCode());
        System.out.println("user1 hashCode -> " + user1.hashCode());
        User user5 = user2.clone();
        System.out.println("user5 == user1 "+(user5==user1));
        System.out.println(user2);
        System.out.println(user5);
    }
}
