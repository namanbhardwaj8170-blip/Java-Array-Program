# Java Array Input & Output Program

This repository contains a simple Java program that demonstrates how to:

- Take array size from the user
- Accept array elements using `Scanner`
- Print all elements of the array

This program is ideal for beginners learning **Java arrays**, **loops**, and **user input handling**.
## 📌 Program Code

```java
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of your array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // for input
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // for output
        System.out.println("Your elements of array are:");
        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}
## 📚 What You Learn From This Program

- How to use `Scanner` for user input  
- How to create and store data in arrays  
- How to use `for` loops  
- Basic Java input/output  
