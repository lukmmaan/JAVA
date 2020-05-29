package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        
        // System.out.println("overtime: ");
        // int inputOvertime = scanner.nextInt();
        // System.out.println("salary: ");
        // int inputsalary = scanner.nextInt();
        // System.out.println("payPerHour: ");
        // int inputpayPerHour = scanner.nextInt();
        // int overtime =scanner.nextInt();
        // Employee orang = new Employee(5000,100);
        // Employee person = new Employee(10_000, 30); //instens
        // Employee wong = new Employee(20_000, 40);
        // orang.setOvertime(inputOvertime);
        // orang.setSalary(inputsalary);
        // orang.setPayPerHour(inputpayPerHour);
        // System.out.println(orang.salary);
        // System.out.println(orang.calculateWage(5));
        // System.out.println(Employee.EmployeeCount);
        while (true) {
            System.out.println("======== MAIN MENU ========");
            int pilihan = (int) Console.readInputNumber("1. Input Buah || 2. Tampil Buah: ");
            if (pilihan==1) {
                Menu.tambahBuah();
            }
            else if (pilihan==2) {
                Menu.tampilListBuah();
            }
            else{
                break;
            }
        }

    }
    	// public static int calculateWage(int salary,int overtime,int payPerHour) {
	//     return salary + (overtime*payPerHour);
	// }
	// public static void testing() {
	//     System.out.println("Testing 123");
	// }
    
}
