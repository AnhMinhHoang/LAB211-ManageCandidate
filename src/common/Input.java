package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Candidate;

public class Input {

    public static String inputMatch(String title, String regex) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.print(title + ": ");
            s = sc.nextLine();
        } while (!s.matches(regex));
        return s;
    }

    public static boolean checkValid(ArrayList<Candidate> candidates, String id) {
        if (candidates == null) {
            return true;
        }
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateId().equals(id)) {
                System.out.println("ID exist");
                return false;
            }
        }
        return true;
    }

    public static int validInt(String title, int max, int min) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(title + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= min && a <= max) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number between " + min + " and " + max + ": ");
            }
        }
        return a;
    }

    public static String inputString(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print(name + ": ");
            s = sc.nextLine();
        }
        return s;
    }
}
