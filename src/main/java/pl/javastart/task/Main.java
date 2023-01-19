package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Słodycze", 21);
        Category category2 = new Category("Chemia", 25);
        Category category3 = new Category("Napoje", 20);
        Product product1 = new Product("Milka", "Czekolada mleczna z orzechami", 8.50, category1);
        Product product2 = new Product("Fairy", "Płyn do mycia naczyń", 10, category3);
        GrossPriceCalculator calc = new GrossPriceCalculator();
        product1.printInfo();
        System.out.println("Cena brutto: " + calc.grossPrice(product1));
        product2.printInfo();
        System.out.println("Cena brutto: " + calc.grossPrice(product2));
    }
}
