/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javahashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nhat Anh
 */
public class JavaHashset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character

        Set<String> pairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            pairs.add(a + "," + b);
            System.out.println(pairs.size());
        }

        sc.close();
    }
}
