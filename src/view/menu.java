/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GoldCandy
 */
public abstract class menu<T> {

    String title;
    ArrayList<T> list = new ArrayList();

    public menu(String title, String[] s) {
        this.title = title;
        for (String item : s) {
            list.add((T) item);
        }
    }

    public menu() {
    }

    ;
    
    public void display() {
        System.out.println("---------------------------");
        System.out.println(title);
        System.out.println("---------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i));
        }
    }

    public int getchoice() {
        Scanner sc = new Scanner(System.in);
        display();
        System.out.println("---------------------------");
        System.out.print("Enter your selection: ");
        return sc.nextInt();
    }

    public abstract void execute(int choice);

    public void run() {
        int choice;
        while (true) {
            choice = getchoice();
            System.out.println("---------------------------");
            execute(choice);
        }
    }
}
