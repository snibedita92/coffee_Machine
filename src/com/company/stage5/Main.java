package com.company.stage5;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposeCup = 9;
    static int money = 550;
    static  boolean machineOn = true;
    static  String action = null;

    public static void main(String[] args) {
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillCoffee();
                    break;
                case "take":
                    takeCoffee();
                    break;
                case "remaining":
                    message();
                    break;
                case "exit":
                    machineOn = false;
                    break;


            }
        } while (machineOn);
    }
    public static void message(){
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", coffeeBeans);
        System.out.printf("%d disposable cups\n", disposeCup);
        System.out.printf("$%d of money\n", money);


    }
    public static void buyCoffee(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.nextLine();

        switch(choice){
            case "1":
                expresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                break;

        }

    }
    public static  void takeCoffee(){

        System.out.printf("I gave you $%d\n", money);
        money = 0;


    }
    public static  void expresso(){
        if(water >= 250 && coffeeBeans >= 16 && disposeCup > 0){
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            coffeeBeans -= 16;
            disposeCup -= 1;
            money += 4;
        }
        else{
            String thingNotAvailable =  null;
            if (water < 250){
                thingNotAvailable = "water";
            }
            else if(coffeeBeans < 16){
                thingNotAvailable = "coffee beans";
            }
            else if (disposeCup < 1){
                thingNotAvailable = "cup";
            }
            System.out.printf("Sorry, not enough %s!\n", thingNotAvailable);
        }

    }
    public static  void latte(){
        if(water >= 350 && milk >= 75 && coffeeBeans >= 20 && disposeCup > 0){
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            disposeCup -= 1;
            money += 7;
        }
        else{
            String thingNotAvailable =  null;
            if (water < 350){
                thingNotAvailable = "water";
            }
            else if (milk < 75){
                thingNotAvailable = "milk";
            }
            else if(coffeeBeans < 20){
                thingNotAvailable = "coffee beans";
            }
            else if (disposeCup < 1){
                thingNotAvailable = "cup";
            }
            System.out.printf("Sorry, not enough %s!\n", thingNotAvailable);
        }

    }
    public static void cappuccino(){
        if(water >= 200 && milk >= 100 && coffeeBeans >= 12 && disposeCup > 0){
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            disposeCup -= 1;
            money += 6;
        }
        else{
            String thingNotAvailable =  null;
            if (water < 200){
                thingNotAvailable = "water";
            }
            else if (milk < 100){
                thingNotAvailable = "milk";
            }
            else if(coffeeBeans < 12){
                thingNotAvailable = "coffee beans";
            }
            else if (disposeCup < 1){
                thingNotAvailable = "cup";
            }
            System.out.printf("Sorry, not enough %s!\n", thingNotAvailable);
        }

    }
    public static  void fillCoffee(){
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffeeBeans += addBeans;
        disposeCup += addCups;

    }


}