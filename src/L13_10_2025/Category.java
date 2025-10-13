package L13_10_2025;

public enum Category {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    FOOD("Продукты питания"),
    BOOKS("Книги");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
