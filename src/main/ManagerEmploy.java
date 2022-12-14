package main;

import Utils.Validate;
import model.Employ;
import model.Programmer;
import model.Verifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmploy {
    public static  List<Employ> employList = new ArrayList<>();

    public ManagerEmploy(List<Employ> employList) {
    }

    public static List<Employ> getEmployList() {
        return employList;
    }

    public static void setEmployList(List<Employ> employList) {
        ManagerEmploy.employList = employList;
    }

    public void addEmploy() {
        Scanner scanner = new Scanner(System.in);
        Programmer emlloy1;
        Verifier emlloy2;
        int ch;
        System.out.println("Select staff:\n(0) Programmer.\n (1) Tester.");
        ch = Validate.getInt(scanner, "Enter select: ");
        if(ch == 0){
            System.out.println("Enter Information Employ Programmer:");
            emlloy1 = new Programmer();
            emlloy1.inputEmployP(employList);
            employList.add(emlloy1);
        }else {
            System.out.println("Enter Information Employ Verifier:");
            emlloy2 = new Verifier();
            emlloy2.inputEmployV(employList);
            employList.add(emlloy2);
        }
    }

    public void showAllStudentList() {
        System.out.println("Show All Employ List:");
        for (Employ employ : employList) {
            System.out.println(em.toString());
            if (employ instanceof Programmer) {
                System.out.println("Salary Programmer: "+em.countSalary() + "VNĐ");;
            }
            if (employ instanceof Verifier) {
                System.out.println("Salary Verifier: "+em.countSalary() + "VNĐ");;
            }
        }
    }

    public double calculateAverageSalary(){
        double sum1 = 0;
        double sum2 = 0;
        for (Employ employ : employList) {
            if (employ instanceof Programmer) {
                sum1+=employ.countSalary();
            }
            if (employ instanceof Verifier) {
                sum2+=employ.countSalary();
            }
        }
        return (sum2+sum1)/2;
        }

        public void showListEmploySalaries(){
            System.out.println("Show employees whose salary is lower than the average salary: ");
            for (Employ em : employList) {
                if (em.countSalary() < calculateAverageSalary())
                    System.out.println(em.toString());
            }
        }


}
