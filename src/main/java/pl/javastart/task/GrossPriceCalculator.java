package pl.javastart.task;

class GrossPriceCalculator {

    double grossPrice(Product product) {

        if (product.getCategory() != null && (product.getCategory().getName() == "Słodycze" ||
                product.getCategory().getName() == "Chemia")) {
            return product.getNetPrice() + (product.getNetPrice() * (product.getCategory().getVat() / 100));
        } else {
            double universalVat = 28;
            return product.getNetPrice() + (product.getNetPrice() * (universalVat / 100));
        }
    }
}
