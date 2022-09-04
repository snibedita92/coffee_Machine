package com.company.stage3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int hasWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int hasMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int hasCoffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int coffeeNeed = scanner.nextInt();
        int water = 200;
        int milk = 50;
        int coffee = 15;
        int waterCup = (hasWater / water);
        int milkCup = (hasMilk / milk);
        int coffeeCup = (hasCoffee / coffee);
        if(waterCup <= milkCup && waterCup <= coffeeCup){
            int coffeeMade = waterCup;
            if (coffeeMade == coffeeNeed){
                System.out.println("Yes, I can make that amount of coffee");
            }
            else if (coffeeMade > coffeeNeed){
                int extraCup = coffeeMade - coffeeNeed;
                System.out.println("Yes, I can make that amount of coffee (and even" + " "
                        + extraCup + " " + "more than that)");
            }
            else{
                System.out.println("No, I can make only" + " " + coffeeMade + " " +  "cup(s) of coffee");
            }
        }
        else if(milkCup <= waterCup && milkCup <= coffeeCup){
            int coffeeMade = milkCup;
            if (coffeeMade == coffeeNeed){
                System.out.println("Yes, I can make that amount of coffee.");
            }
            else if (coffeeMade > coffeeNeed){
                int extraCup = coffeeMade - coffeeNeed;
                System.out.println("Yes, I can make that amount of coffee (and even" + " "
                        + extraCup + " " + "more than that)");
            }
            else{
                System.out.println("No, I can make only" + " " + coffeeMade + " " +  "cup(s) of coffee");
            }

        }
        else{
            int coffeeMade = coffeeCup;
            if (coffeeMade == coffeeNeed){
                System.out.println("Yes, I can make that amount of coffee");
            }
            else if (coffeeMade > coffeeNeed){
                int extraCup = coffeeMade - coffeeNeed;
                System.out.println("Yes, I can make that amount of coffee (and even" + " "
                        + extraCup + " " + "more than that)");
            }
            else{
                System.out.println("No, I can make only" + " " + coffeeMade + " " +  "cup(s) of coffee");
            }
        }

    }
}
