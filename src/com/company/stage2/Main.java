package com.company.stage2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("For" + " "+ value + " " +"cups of coffee you will need:");
        int water = 200;
        int milk = 50;
        int coffee = 15;
        int reqWater = value * water;
        int reqMilk = value * milk;
        int reqCoffee = value * coffee;
        System.out.println(reqWater+ " " + "ml of water");
        System.out.println(reqMilk+ " " + "ml of milk");
        System.out.println(reqCoffee+ " " + "g of coffee beans");

    }
}
