/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Input;
public class Intern extends Candidate{
    private String majors;
    private String semester;
    private String university;

    public Intern(String majors, String semester, String university, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }
    
    public Intern(){}
    
    @Override
    public void input(){
        super.input();
        this.setMajors(Input.inputString("Majors"));
        this.setSemester(Input.inputString("Semester"));
        this.setUniversity(Input.inputString("University"));
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    
}
