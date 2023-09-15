/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Input;
import java.util.Calendar;

/**
 *
 * @author GoldCandy
 */
public class Candidate {

    private String candidateId;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate(String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public Candidate() {
    }

    public void input() {
        this.setFirstName(Input.inputString("First name"));
        this.setLastName(Input.inputString("Last name"));
        this.setBirthDate(Input.validInt("Birth year", 2023, 1900));
        this.setAddress(Input.inputString("Address"));
        this.setPhone(Input.inputMatch("Phone(6-11 numbers)", "^\\d{6,11}$"));
        this.setEmail(Input.inputMatch("Email", "^[A-Za-z0-9]+@[A-Za-z.]+\\.[A-Za-z]+$"));
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " | " + this.getBirthDate() + " | " + this.getAddress() + " | " + this.getPhone() + " | " + this.getEmail() + " | " + this.getCandidateType();
    }
}
