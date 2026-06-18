package com.cognizant.dsa.Ex_2E.EcommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class EcommerceApplication {
    
    public static void main(String[] args) {
        
        Product[] inventory = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Coffee Maker", "Home Appliances"),
            new Product(108, "Running Shoes", "Apparel"),
            new Product(102, "Mechanical Keyboard", "Electronics"),
            new Product(104, "Desk Lamp", "Furniture")
        };

        int searchId = 108;

        System.out.println("Testing Linear Search");
      
        Product found = EcommerceSearch.linearSearch(inventory, searchId);
        
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n Testing Binary Search");
        
        Arrays.sort(inventory, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.productId, p2.productId);
            }
        });

        Product found2 = EcommerceSearch.binarySearch(inventory, searchId);
        
        if (found2 != null) {
            System.out.println("Found: " + found2);
        } else {
            System.out.println("Product not found.");
        }
    }
}