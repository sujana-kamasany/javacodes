import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();

        productPrices.put("Laptop", 899.99);
        productPrices.put("Smartphone", 599.99);
        productPrices.put("Headphones", 99.99);
        productPrices.put("Tablet", 349.99);

        String productName = "Laptop";
        if (productPrices.containsKey(productName)) {
            double price = productPrices.get(productName);
            System.out.println(productName + " price: $" + price);
        } else {
            System.out.println("Product not found: " + productName);
        }

        System.out.println("Product Catalog:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            String name = entry.getKey();
            double price = entry.getValue();
            System.out.println(name + ": $" + price);
        }

        String updatedProduct = "Smartphone";
        double newPrice = 649.99;
        if (productPrices.containsKey(updatedProduct)) {
            productPrices.put(updatedProduct, newPrice);
            System.out.println("Updated price of " + updatedProduct + " to $" + newPrice);
        } else {
            System.out.println("Product not found: " + updatedProduct);
        }

        String removedProduct = "Tablet";
        if (productPrices.containsKey(removedProduct)) {
            productPrices.remove(removedProduct);
            System.out.println("Removed " + removedProduct + " from the catalog.");
        } else {
            System.out.println("Product not found: " + removedProduct);
        }

        System.out.println("Number of products in the catalog: " + productPrices.size());

        if (productPrices.isEmpty()) {
            System.out.println("The product catalog is empty.");
        } else {
            System.out.println("The product catalog is not empty.");
        }
    }
}
