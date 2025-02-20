package Voencomat;

import java.util.Arrays;

public class ArrayRecruits {
    private Recruit[] recruits;
    private int size;

    public ArrayRecruits(int capacity) {
        this.recruits = new Recruit[capacity];
        this.size = 0;
    }

    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size++] = recruit;
        } else {
            System.out.println("Массив новобранцев полон.  Новый новобранец не добавлен.");
        }
    }

    public Recruit get(int index) {
        if (index >= 0 && index < size) {
            return recruits[index];
        } else {
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public void sortByLastName() {
        Arrays.sort(recruits, 0, size, (r1, r2) -> r1.getLastName().compareTo(r2.getLastName()));
    }

}
