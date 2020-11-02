package com.company;

import java.util.Scanner;

public class ChampionsLeague {
    public static void main(String[] args) {
        Teams teams = new Teams();
        String operation = null;

        do {
            operation = readDataFromKeyboard("operation");
            if ("Add club".equalsIgnoreCase(operation)) {
                addClub(teams);
            } else if ("List of teams".equalsIgnoreCase(operation)) {
                teams.listOfTeams();
            } else if ("Delete".equalsIgnoreCase(operation)) {
                teams.deleteClubFromTheList();
            }else if (!"exit".equalsIgnoreCase(operation)){
                System.out.println("Invalid operation!");
            }
        } while (!"exit".equalsIgnoreCase(operation));

    }

    private static void addClub(Teams teams) {
        String id = readDataFromKeyboard("ID");
        String country = readDataFromKeyboard("Country");
        String clubName = readDataFromKeyboard("Club");
        Club club = new Club(Integer.valueOf(id), country, clubName);
        teams.addClub(club);
    }

    private static String readDataFromKeyboard(String parametr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + parametr + ":");
        String value = scanner.nextLine();
        System.out.println("Entered " + parametr + ":" + value);
        return value;
    }
}