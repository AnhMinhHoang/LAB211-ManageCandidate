/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DataAccess.CandidateDao;
import java.util.ArrayList;
import model.Candidate;
/**
 *
 * @author GoldCandy
 */
public class CandidateRepository implements ICandidateRepository{

    @Override
    public void create(int type, ArrayList<Candidate> data) {
        CandidateDao.Instance().create(type, data);
    }

    @Override
    public void search(ArrayList<Candidate> data) {
        CandidateDao.Instance().search(data);
    }
}
