/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Input;
        
public class Experience extends Candidate{
    private int explnYear;
    private String proSkill;

    public Experience(int explnYear, String proSkill, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }
    
    public Experience(){
        
    }
    
    @Override
    public void input(){
        super.input();
        this.setExplnYear(Input.validInt("Year of Exprerience(0-100)", 100, 0));
        this.setProSkill(Input.inputString("Professional Skill"));
    }
    
    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
