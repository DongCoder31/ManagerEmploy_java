package model;

import main.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Verifier extends Employ {

    Scanner scanner = new Scanner(System.in);

    private int errorNumbeDetected;

    public Verifier() {
        super();
    }

    public Verifier(String employeeCode, String fullName, int age, String phoneNumber, String email, float basicSalary, int errorNumbeDetected) {
        super(employeeCode, fullName, age, phoneNumber, email, basicSalary);
        this.errorNumbeDetected = errorNumbeDetected;
    }

    public int getErrorNumbeDetected() {
        return errorNumbeDetected;
    }

    public void setErrorNumbeDetected(int errorNumbeDetected) {
        this.errorNumbeDetected = errorNumbeDetected;
    }

    @Override
    public double countSalary() {
        return getBasicSalary() + getErrorNumbeDetected()*150.000;
    }

    @Override
    public String toString(){
        return super.toString() + "Error Numbe Detected: " + this.errorNumbeDetected;
    }

    public void inputEmployV( List<Employ> employListl ){
        super.inputEmploy(employListl);
        this.errorNumbeDetected = Validate.getInt(scanner,"Enter over error numbe detected ");
    }
}
