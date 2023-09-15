/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Input;

public class Fresher extends Candidate{
    private int graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher(int graduation_date, String graduation_rank, String education, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }
    
    public Fresher(){}
    
    @Override
    public void input(){
        super.input();
        this.setGraduation_date(Input.validInt("Graduation date(1970-2023)", 2023, 1970));
        this.setEducation(Input.inputString("Education"));
        this.setGraduation_rank(Input.inputMatch("Rank(Excellence|Good|Fair|Poor)", "Excellence|Good|Fair|Poor"));
    }

    public int getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
