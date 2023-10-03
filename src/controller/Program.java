/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.CandidateRepository;
import java.util.ArrayList;
import model.*;
import view.menu;
import common.Library;

/**
 *
 * @author GoldCandy
 */
public class Program extends menu {

    static String[] mc = {"Experience", "Fresher", "Internship", "Searching", "Exit"};
    ArrayList<Candidate> data = new ArrayList();
    Library lib;
    CandidateRepository algorithm;

    public Program() {
        super("CANDIDATE MANAGEMENT SYSTEM", mc);
        lib = new Library();
        algorithm = new CandidateRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("Create Experience");
                algorithm.create(1, data);
                break;
            }
            case 2: {
                System.out.println("Create Fresher");
                algorithm.create(2, data);
                break;
            }
            case 3: {
                System.out.println("Create Internship");
                algorithm.create(3, data);
                break;
            }
            case 4: {
                System.out.println("Searching");
                lib.display(data);
                algorithm.search(data);
                break;
            }
            case 5: {
                System.out.println("Exit Program...");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("No such choice!");
                break;
            }
        }
    }
}
