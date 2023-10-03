/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Candidate;

/**
 *
 * @author GoldCandy
 */
public interface ICandidateRepository {
    public void create(int choice, ArrayList<Candidate> data);
    
    public void search(ArrayList<Candidate> data);
}
