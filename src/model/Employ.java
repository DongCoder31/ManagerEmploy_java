package model;

import main.Validate;
import java.util.List;
import java.util.Scanner;

public abstract class Employ {
    // init
    public String employeeCode;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;
    private float basicSalary;

    public Employ(){
        super();
    }

    public Employ(String employeeCode, String fullName, int age, String phoneNumber, String email, float basicSalary) {
        super();
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }



    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public float getBasicSalary() {return basicSalary;}

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double countSalary();

    public void inputEmploy(List<Employ> employList) {
        Scanner scanner = new Scanner(System.in);
        boolean checkID;
        do {
            checkID = true;
          this.employeeCode = Validate.getString(scanner,"Enter Employ code:");

            for (Employ ep : employList) {
                if (ep.getEmployeeCode().equalsIgnoreCase(this.employeeCode)){
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);
        this.fullName = Validate.getString(scanner, "Enter name employ:");
        this.age = Validate.getInt(scanner, "Enter age employ:");
        this.phoneNumber = Validate.getPhone(scanner, "Enter phone Number employ:");
        this.email = Validate.getEmail(scanner, "Enter email employ:");
        this.basicSalary = Validate.getFloat(scanner, "Enter basic Salary employ:");
    }


    @Override
    public  String toString(){
        return "Employ code: " +this.employeeCode + "\t"+
                "Name: " + this.fullName + "\t"+
                "Agr: " + this.age + "\t"+
                "Phone: " + this.phoneNumber + "\t"+
                "Email: " + this.email + "\t"+
                "Basic salary: " + this.basicSalary + "\t" ;
    }
}
