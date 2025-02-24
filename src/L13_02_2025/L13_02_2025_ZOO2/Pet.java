package L13_02_2025.L13_02_2025_ZOO2;

public abstract class Pet extends Animal {

    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getOwnerName() {
        if (owner != null) {
            return owner.getName() + " " + owner.getSurName();
        } else {
            return "Без владельца";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " хозяин " + owner;
    }
}