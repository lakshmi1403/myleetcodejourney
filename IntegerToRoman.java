/*
Here this is a very basic question which I came across in Tiktok assessment aswell.
I have just used a string and appended each roman number and went so on.
*/





package com.example.myleetcodejourney;

import java.util.Scanner;

public class IntegerToRoman {
        public static String intToRoman(int num) {
            if (num < 1 || num > 3999)
                return "Invalid Roman Number Value";

            String s = "";
            while (num >= 1000) {
                s += "M";
                num -= 1000;        }
            while (num >= 900) {
                s += "CM";
                num -= 900;
            }
            while (num >= 500) {
                s += "D";
                num -= 500;
            }
            while (num >= 400) {
                s += "CD";
                num -= 400;
            }
            while (num >= 100) {
                s += "C";
                num -= 100;
            }
            while (num >= 90) {
                s += "XC";
                num -= 90;
            }
            while (num >= 50) {
                s += "L";
                num -= 50;
            }
            while (num >= 40) {
                s += "XL";
                num -= 40;
            }
            while (num >= 10) {
                s += "X";
                num -= 10;
            }
            while (num >= 9) {
                s += "IX";
                num -= 9;
            }
            while (num >= 5) {
                s += "V";
                num -= 5;
            }
            while (num >= 4) {
                s += "IV";
                num -= 4;
            }
            while (num >= 1) {
                s += "I";
                num -= 1;
            }
            return s;
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter numeric number: ");
            String i = scanner.nextLine();
            int num=Integer.parseInt(i);

            String romanNum= intToRoman(num);

            System.out.println(romanNum);
            scanner.close();
        }
}
