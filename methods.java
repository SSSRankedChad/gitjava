package com.company;
import java.util.Scanner;
import java.io.*;
 public class methods {
     public static class Caluculator {
         Scanner in = new Scanner(System.in);

         public long subtract(long a, long b) {
             long subtract = a - b;
             return subtract;
         }

         public long add(long a, long b) {
             long add = a + b;
             return add;
         }

         public long mutliply(long a, long b) {
             long mutliply = a * b;
             return mutliply;
         }

         public long divide(long a, long b) {
             long divide = a / b;
             return divide;
         }
     }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("----------------Calculator------------------\n");
         System.out.print("Enter a number: ");
         long a = in.nextLong();
         System.out.print("Enter another number: ");
         long b = in.nextLong();
         System.out.print("1.Add\n");
         System.out.print("2.Subtract\n");
         System.out.print("3.Mutiplication\n");
         System.out.print("4.Division\n");
         System.out.print("5.Quit\n");
         System.out.print("What choice do you wish?: ");
         int choice = in.nextInt();
         Caluculator calc = new Caluculator();
         while (choice < 0 || choice > 5) {
             System.out.print("Out of bounds. Enter a number in range: ");
             choice = in.nextInt();
         }
         if (choice == 1) {
             System.out.print(calc.add(a, b));
         } else if (choice == 2) {
             System.out.print(calc.subtract(a, b));
         } else if (choice == 3) {
             System.out.print(calc.mutliply(a, b));
         } else if (choice == 4) {
             System.out.print(calc.divide(a, b));
         }

     }
 }


