package L13_02_2025.L13_02_2025_ZOO2;


import java.util.ArrayList;
import java.util.List;

public class Main00 {
    public static void main(String[] args) {
        List<Owner> owners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Owner owner = OwnerFactory.next();
            for (int j = 0; j < 200; j++) {
                Pet pet = PetFactory.next();
                owner.addPet(pet);
            }
            owners.add(owner);
        }

        for (Owner owner : owners) {
            System.out.println(owner);
        }
//        Owner owner1 = new Owner();
//        Owner owner2 = new Owner();
//        Owner owner3 = new Owner();
//
//
//        String ownersName;
//        Pet pet1 = new Cat("Барсик",  3);
//        Pet pet2 = new Dog("Бобик",  5);
//        Pet pet3 = new Bird("Кеша",  2);
//        Pet pet4 = new Cat("Мурка",  1);
//
//
//        owner1.addPet(pet1);
//        owner1.addPet(pet2);
//        owner2.addPet(pet3);
//        owner3.addPet(pet4);
//
//
//
//        System.out.println(pet1);
//        System.out.println(pet2);
//        System.out.println(pet3);
//        System.out.println(pet4);
//
//
//        System.out.println(owner1);
//        System.out.println(owner2);
//        System.out.println(owner3);


        System.out.println("Общее количество владельцев: " + Owner.getTotalOwners());
        Swimable[] swimables = new Swimable[1];
        swimables[0] = new Bird("Чик", 5);
        for (Swimable swimable : swimables) {
            swimable.swim();
            if (swimable instanceof Bird bird) {
                bird.move();
            }
        }
        Flyable[] flyables = new Flyable[1];
        flyables[0] = new Bird("Утка", 10);
    }
}

