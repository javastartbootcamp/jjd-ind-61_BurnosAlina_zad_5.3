package pl.javastart.task;

class Product {
    private String name;
    private String description;
    private double netPrice;
    private Category category;

    Product(String name, String description, double netPrice, Category category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }

    Product(String name, String description, double netPrice) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
    }

    void printInfo() {
        if (category == null) {
            System.out.println("Produkt: " + name + "\nOpis: " + description + "\nKategoria: brak\nCena netto: " + netPrice);
        } else {
            System.out.println("Produkt: " + name + "\nOpis: " + description + "\nKategoria: " + category.getName() +
                    "\nCena netto: " + netPrice);
        }
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    double getNetPrice() {
        return netPrice;
    }

    void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    Category getCategory() {
        return category;
    }

    void setCategory(Category category) {
        this.category = category;
    }
}
