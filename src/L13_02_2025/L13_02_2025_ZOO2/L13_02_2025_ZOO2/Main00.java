package L13_02_2025.L13_02_2025_ZOO2.L13_02_2025_ZOO2;



public class Main00 {
    public static void main(String[] args) {
        // Создание владельцев
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Owner owner3 = new Owner();


        String ownersName;
        Pet pet1 = new Cat("Барсик",  3);
        Pet pet2 = new Dog("Бобик",  5);
        Pet pet3 = new Bird("Кеша",  2);
        Pet pet4 = new Cat("Мурка",  1);


        owner1.addPet(pet1);
        owner1.addPet(pet2);
        owner2.addPet(pet3);
        owner3.addPet(pet4);



        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(pet4);


        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);


        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());
    }
}


