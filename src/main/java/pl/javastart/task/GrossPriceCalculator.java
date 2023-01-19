package pl.javastart.task;

class GrossPriceCalculator {

    double grossPrice(Product product) {
        double universalVat = 28;
        if (product.getCategory() != null) {
            switch (product.getCategory().getName()) {
                case "Słodycze":
                case "Chemia":
                    return grossPriceCalculator(product);
                default:
                    return grossPriceCalculator2(product, universalVat);
            }
        } else {
            return grossPriceCalculator2(product, universalVat);
        }
    }

    private double grossPriceCalculator(Product product) {
        return product.getNetPrice() + (product.getNetPrice() * (product.getCategory().getVat() / 100));
    }

    private double grossPriceCalculator2(Product product, double universalVat) {
        return product.getNetPrice() + (product.getNetPrice() * (universalVat / 100));
    }
}
