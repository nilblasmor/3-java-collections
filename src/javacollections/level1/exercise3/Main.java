package javacollections.level1.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> capitals = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("countries.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                capitals.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            System.out.println("There was an error reading the file.");
            return;
        }

        System.out.println("Insert your username:");
        String username = sc.nextLine();

        ArrayList<String> countriesList = new ArrayList<>(capitals.keySet());
        Random rng = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = rng.nextInt(countriesList.size());
            String country = countriesList.remove(randomIndex);

            System.out.println("What is the capital of " + country + "?");
            String answer = sc.nextLine();

            String correctAnswer = capitals.get(country);
            if (answer.equalsIgnoreCase(correctAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Your score was: " + score + "/10");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            writer.write(username + " - " + score);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("There was an error writing the file.");
            return;
        }

        sc.close();
    }
}

