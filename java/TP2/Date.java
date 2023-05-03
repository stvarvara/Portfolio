package TP2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        this.day = input.nextInt();
        System.out.print("Enter month: ");
        this.month = input.nextInt();
        System.out.print("Enter year: ");
        this.year = input.nextInt();
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}