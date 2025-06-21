package week1DSA.EcommerceSearchApp;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (sorted array required)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Demo main method
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone", "Electronics"),
            new Product(102, "MacBook", "Electronics"),
            new Product(103, "Nike Shoes", "Footwear"),
            new Product(104, "T-shirt", "Clothing"),
            new Product(105, "Book", "Stationery")
        };

        System.out.println("=== Linear Search ===");
        Product foundLinear = linearSearch(products, "Nike Shoes");
        System.out.println("Result: " + (foundLinear != null ? foundLinear : "Product not found"));

        // Sort array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\n=== Binary Search ===");
        Product foundBinary = binarySearch(products, "Nike Shoes");
        System.out.println("Result: " + (foundBinary != null ? foundBinary : "Product not found"));
    }
}
