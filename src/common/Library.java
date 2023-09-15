/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import model.*;

public class Library {

    public void display(ArrayList<Candidate> data) {
        int count = 0;
        System.out.println("==================EXPERIENCE CANDIDATE==================");
        for (Candidate temp : data) {
            if (temp instanceof Experience) {
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
        count = 0;
        System.out.println("==================FRESHER CANDIDATE==================");
        for (Candidate temp : data) {
            if (temp instanceof Fresher) {
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
        count = 0;
        System.out.println("==================INTERN CANDIDATE==================");
        for (Candidate temp : data) {
            if (temp instanceof Intern) {
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found!");
        }
        System.out.println("---------------------------------------------------");
    }
}
