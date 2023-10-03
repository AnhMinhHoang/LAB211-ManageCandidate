/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import common.Input;
import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author GoldCandy
 */
public class CandidateDao {
    private static CandidateDao instance = null;
    public static CandidateDao Instance(){
        if(instance == null){
            synchronized (CandidateDao.class) {
                if(instance == null){
                    instance = new CandidateDao();
                }
            }
        }
        return instance;
    }
    
    public void create(int type, ArrayList<Candidate> data) {
        String opt = "Y";
        while (opt.equals("Y")) {
            boolean check = false;
            Candidate dt = null;
            switch (type) {
                case 1: {
                    dt = new Experience();
                    if (data == null) {
                        dt.setCandidateId(Input.inputString("ID"));
                    } else {
                        while (check == false) {
                            dt.setCandidateId(Input.inputString("ID"));
                            check = Input.checkValid(data, dt.getCandidateId());
                        }
                    }
                    dt.input();
                    dt.setCandidateType(0);
                    break;
                }
                case 2: {
                    dt = new Fresher();
                    if (data == null) {
                        dt.setCandidateId(Input.inputString("ID"));
                    } else {
                        while (check == false) {
                            dt.setCandidateId(Input.inputString("ID"));
                            check = Input.checkValid(data, dt.getCandidateId());
                        }
                    }
                    dt.input();
                    dt.setCandidateType(1);
                    break;
                }
                case 3: {
                    dt = new Intern();
                    if (data == null) {
                        dt.setCandidateId(Input.inputString("ID"));
                    } else {
                        while (check == false) {
                            dt.setCandidateId(Input.inputString("ID"));
                            check = Input.checkValid(data, dt.getCandidateId());
                        }
                    }
                    dt.input();
                    dt.setCandidateType(2);
                    break;
                }
            }
            if (data != null) {
                data.add(dt);
            }
            opt = Input.inputMatch("Do you want to continue(Y/N)", "[YN]");
        }
    }
    
    public void search(ArrayList<Candidate> data) {
        if (data.isEmpty()) {
            System.out.println("No one to search!");
            return;
        }
        String name = Input.inputString("Input Candidate name(First name or Last name)");
        int type = Input.validInt("Input type of candidate: ", 2, 0);
        ArrayList<Candidate> store = new ArrayList();
        System.out.println("");
        for (Candidate temp : data) {
            if (temp.getCandidateType() == type && (temp.getFirstName().toLowerCase().contains(name.toLowerCase()) || temp.getLastName().toLowerCase().contains(name.toLowerCase()))) {
                store.add(temp);
            }
        }
        if (store.isEmpty()) {
            System.out.println("Not found any candidates!");
        } else {
            System.out.println("The candidates found:");
            for (Candidate temp : store) {
                System.out.println(temp.toString());
            }
        }
    }
}
