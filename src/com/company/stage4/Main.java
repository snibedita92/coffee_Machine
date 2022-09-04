package com.company.stage4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The coffee machine has:\n" +
                "400 ml of water\n" +
                "540 ml of milk\n" +
                "120 g of coffee beans\n" +
                "9 disposable cups\n" +
                "$550 of money");
        int water = 400;
        int milk = 540;
        int coffeeBean = 120;
        int disposableCup = 9;
        int money = 550;
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        if(action.equals("buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int option = scanner.nextInt();
            disposableCup = disposableCup -1;
            if(option == 1){
                water = water - 250;
                coffeeBean = coffeeBean - 16;
                money = money + 4;
                System.out.println("The coffee machine has:\n" +
                        water +" " + "ml of water\n" +
                         milk + " " + "ml of milk\n" +
                        coffeeBean+ " " + "g of coffee beans\n" +
                        disposableCup+ " " + "disposable cups\n" +
                        "$" + money + " " + "of money");
            }
            else if(option == 2){
                water = water - 350;
                milk = milk - 75;
                coffeeBean = coffeeBean - 20;
                money = money + 7;
                System.out.println("The coffee machine has:\n" +
                        water +" " + "ml of water\n" +
                        milk + " " + "ml of milk\n" +
                        coffeeBean+ " " + "g of coffee beans\n" +
                        disposableCup+ " " + "disposable cups\n" +
                        "$" + money + " " + "of money");
            }
            else if(option == 3){
                water = water - 200;
                milk = milk - 100;
                coffeeBean = coffeeBean - 12;
                money = money + 6;
                System.out.println("The coffee machine has:\n" +
                        water +" " + "ml of water\n" +
                        milk + " " + "ml of milk\n" +
                        coffeeBean+ " " + "g of coffee beans\n" +
                        disposableCup+ " " + "disposable cups\n" +
                        "$" + money + " " + "of money");
            }
        }
        else if(action.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            int addWater = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            int addMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            int addCoffeeBean = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int addCup = scanner.nextInt();
            water = water + addWater;
            milk = milk + addMilk;
            coffeeBean = coffeeBean + addCoffeeBean;
            disposableCup = disposableCup + addCup;
            System.out.println("The coffee machine has:\n" +
                    water +" " + "ml of water\n" +
                    milk + " " + "ml of milk\n" +
                    coffeeBean+ " " + "g of coffee beans\n" +
                    disposableCup+ " " + "disposable cups\n" +
                    "$" + money + " " + "of money");

        }
        else if(action.equals("take")){
            System.out.println("I gave you"+ " " + money);
            money = 0;
            System.out.println("The coffee machine has:\n" +
                    water +" " + "ml of water\n" +
                    milk + " " + "ml of milk\n" +
                    coffeeBean+ " " + "g of coffee beans\n" +
                    disposableCup+ " " + "disposable cups\n" +
                    "$" + money + " " + "of money");

        }

    }
}
