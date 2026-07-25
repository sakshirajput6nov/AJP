package Qspider;

import java.util.*;

public class Q4_usage_Scanner_methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= Case 1 =================
        int age1 = sc.nextInt();      // Input: 23 (reads only the integer)
        sc.nextLine();                // Consumes the leftover newline (\n)
        String name1 = sc.nextLine(); // Now reads the full name correctly
        System.out.println(age1 + " " + name1);

        // ================= Case 2 =================
        String name2 = sc.nextLine(); // Reads the full name (e.g., Sakshi Rajput)
        int age2 = sc.nextInt();      // Reads the integer
        sc.nextLine();                // Consumes the leftover newline after nextInt()
        System.out.println(age2 + " " + name2);

        // ================= Case 3 =================
        String name3 = sc.nextLine(); // If previous input was nextInt(), this may read only the leftover newline (empty string)
        String name4 = sc.nextLine(); // Reads the actual input
        System.out.println(name3 + name4);

        sc.close();
    }
}
