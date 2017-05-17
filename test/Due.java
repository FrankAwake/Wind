package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create a story
 */
public class Due {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            //name
            System.out.print("Enter your name:");
            String name = input.readLine();
            //age
            System.out.print("Enter your age:");
            String age = input.readLine();
            //city
            System.out.print("Enter the name of a city:");
            String cityName = input.readLine();
            //college
            System.out.print("Enter the name of a college:");
            String collegeName = input.readLine();
            //profession
            System.out.print("Enter profession:");
            String profession = input.readLine();
            //type
            System.out.print("Enter a type of animal:");
            String animalType = input.readLine();
            //pet
            System.out.print("Enter a pet name:");
            String petName = input.readLine();

            //output
            String story = "There once was a person named %s,who lived in %s. At the age of %s,"
                           + "%s went to college at %s. %s graduated and went to work as a %s."
                           + " Then,%s adopted a %s named %s. They both lived happily ever after!";

            System.out.print(String.format(story, name, cityName, age, name, collegeName,
                    name, profession, name, animalType, petName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
