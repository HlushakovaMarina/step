package L23_01_2025;

public class Task00 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Молоко";
        product1.price = 10;
        product1.quantity = 800;
        int totalValue = product1.getTotalValue();
        System.out.println("Общая стоимость молока на складе =" +totalValue);
        Product product2 = new Product();
        product2.name = "Хлеб";
        product2.price = 1000;
        product2.quantity = 15;
        int totalValue2 = product2.getTotalValue();
        System.out.println("Общая стоимость хлеба на складе=" + totalValue2);
        product1=product2;
        product1.quantity=500;
        System.out.println(product1);
        Product product3 = new Product("Яблоко", 40, 900);
        int totalValue3=  product3.getTotalValue();
        System.out.println("Общая стоимость" +product3.name+ "=" +totalValue3);
    }

}
