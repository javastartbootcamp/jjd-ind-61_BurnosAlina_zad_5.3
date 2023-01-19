package pl.javastart.task;

class Category {

    private String name;
    private double vat;

    Category(String name, double vat) {
        this.name = name;
        this.vat = vat;
    }

    double getVat() {
        return vat;
    }

    void setVat(double vat) {
        this.vat = vat;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
