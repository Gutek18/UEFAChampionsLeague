package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teams {
//TODO
// dodaj, usuń, usuń wszystko, przywroc wszystko

    private Map<Integer, Club> clubs = new HashMap<>();

    public void addClub(Club club) {
        clubs.put(club.getId(),club);
    }

    void listOfTeams(){
        for (Map.Entry<Integer, Club> entry : clubs.entrySet()) {
            int k = entry.getKey();
            Club c = entry.getValue();
            System.out.println("Lp: " + k + ", " + c);
        }
        System.out.println("List of clubs: " + clubs.size());
    }

    public void deleteClubFromTheList() {
        System.out.println("Enter id club to delete");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        clubs.remove(i);
    }
}