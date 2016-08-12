/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joedrinks;

import java.util.Scanner;

/**
 *
 * @author ken
 */
public class flavour_ouces {

    public void ouces() { //method
        String welcome = "Welcome to Father Joe Ice Drinks!";
        System.out.println(welcome);

        String one = "Strawberry 12 fl.oz";
        String two = "Apple 8 fl.oz.";
        String three = "Blueberry 16 fl.oz";

        System.out.println("The flavours are");
        System.out.println("1:" + " " + one);
        System.out.println("2:" + " " + two);
        System.out.println("3:" + " " + three);

        Scanner new_scan = new Scanner(System.in); // scanner object

        String add_statement = "..." + "\n" + "..." + "\n" + "yummy so delicious"; //variable
        String err = "Invalid selection, please try again:";
        //variable

        // int fluids_input;
        //fluids_input = new_scan.nextInt();
        boolean start = true;
        int user_input;
        user_input = new_scan.nextInt();
        if (user_input == -1) {
            System.exit(0);
        }
        //System.out.println("user_input" + user_input);
        switch (user_input) {
            case 1:
                while (start) {
                    String fluids = "Enter how many fluid ounces to add? (1-12):";
                    System.out.println(fluids);

                    user_input = new_scan.nextInt();
                    if (user_input > 0 && user_input <= 12) {
                        System.out.println("Adding" + " " + user_input + " " + "fluid ouces of Strawberry to the ice drink");
                        System.out.println(add_statement);
                        start = false;
                    } else if (user_input == -1) {
                        System.exit(0);
                    } else {
                        System.out.println(err);
                        continue;
                    }
                }
                break;

            case 2:
                while (start) {
                    String fluids = "Enter how many fluid ounces to add? (1-8):";
                    System.out.println(fluids);

                    user_input = new_scan.nextInt();
                    if (user_input > 0 && user_input <= 8) {
                        System.out.println("Adding" + " " + user_input + " " + "fluid ouces of Apple to the ice drink");
                        System.out.println(add_statement);
                        start = false;
                    } else if (user_input == -1) {
                        System.exit(0);
                    } else {
                        System.out.println(err);
                        continue;
                    }
                }
                break;
            case 3:
                while (start) {
                    String fluids = "Enter how many fluid ounces to add? (1-16):";
                    System.out.println(fluids);

                    //int user_input;
                    user_input = new_scan.nextInt();
                    if (user_input > 0 && user_input <= 16) {
                        System.out.println("Adding" + " " + user_input + " " + "fluid ouces of Blueberry to the ice drink");
                        System.out.println(add_statement);
                        start = false;
                    } else if (user_input == -1) {
                        System.exit(0);
                    } else {
                        System.out.println(err);
                        continue;
                    }
                    break;
                }

            default:
                System.out.println("Sorry that is not a valid selection.");
                break;

        }
    }
}
