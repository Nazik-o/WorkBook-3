package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {"Stay hungry, stay foolish. — Steve Jobs",
                "Whether you think you can or you think you can’t, you’re right. — Henry Ford",
                "Simplicity is the soul of efficiency. — Austin Freeman",
                "The only way out is through. — Robert Frost",
                "Well done is better than well said. — Benjamin Franklin",
                "What you do speaks so loudly that I cannot hear what you say. — Ralph Waldo Emerson",
                "If I have seen further it is by standing on the shoulders of Giants. — Isaac Newton",
                "Make it work, make it right, make it fast. — Kent Beck",
                "Premature optimization is the root of all evil. — Donald Knuth",
                "Programs must be written for people to read. — Harold Abelson"
        };
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("Choose a quote from 1 to 10 : ");
        int choice = scanner.nextInt();


        if (choice < 1 || choice > 10) {
            System.out.println("Invalid input, choose between 1 and 10!");
        } else {
            // User inputs from 1-10 but in reality we need to change our choices from 0-9
            int index = choice - 1;
            System.out.println(quotes[index]);
        }
        }
        catch (Exception exception) {
        System.out.println("Error: please enter a valid number!!");
    }


        scanner.close();
    }
}

