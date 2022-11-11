package model;

import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class Programmer extends Employ {


    Scanner scanner = new Scanner(System.in);
    private int overtimeHours;

    public Programmer() {
        super();
    }

    public Programmer(String employeeCode, String fullName, int age, String phoneNumber, String email, float basicSalary, int overtimeHours) {
        super(employeeCode, fullName, age, phoneNumber, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double countSalary() {
        return getBasicSalary() + getOvertimeHours()*400.000;
    }

    @Override
    public String toString(){
        return super.toString() + "Overtime Hours: " + this.overtimeHours;
    }

    public void inputEmployP( List<Employ> employList ){
        super.inputEmploy(employList);
        this.overtimeHours = Validate.getInt(scanner,"Enter over timeHours ");
    }
}
