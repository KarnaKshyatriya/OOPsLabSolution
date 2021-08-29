/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import Service.EmailService;
import java.util.Scanner;
import model.Department;
import model.Employee;

/**
 *
 * @author toast
 */
public class Lab1 {

    public static void main(String args[]) {
        Employee employee = new Employee("Soumalya", "Khan");
        System.out.println("Select your Department number \n (eg: enter 1 if department is Technical) ");
        System.out.println("1: Technical \n 2: Admin \n 3: Human Resource \n 4: Legal");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        EmailService eService = new EmailService();
        String fName = employee.getFirstName();
        switch (choice) {
            case 1:
                Department department = new Department("Technical");
                String email = eService.generateEmailAddress(employee, department);
                System.out.println("Dear " + fName + " Your generated credentials are as follows: ");
                System.out.println("Email ---> " + email + "\n" + "Password --->" + eService.generatePassword());
                break;
            case 2:
                Department department1 = new Department("Admin");
                String email1 = eService.generateEmailAddress(employee, department1);
                System.out.println("Dear " + fName + " Your generated credentials are as follows: ");
                System.out.println("Eamil ---> " + email1 + "\n" + "Password --->" + eService.generatePassword());
                break;
            case 3:
                Department department2 = new Department("Human_Resource");
                String email2 = eService.generateEmailAddress(employee, department2);
                System.out.println("Dear " + fName + " Your generated credentials are as follows: ");
                System.out.println("Eamil ---> " + email2 + "\n" + "Password --->" + eService.generatePassword());
                break;
            case 4:
                Department department3 = new Department("Human Resource");
                String email3 = eService.generateEmailAddress(employee, department3);
                System.out.println("Dear " + fName + " Your generated credentials are as follows: ");
                System.out.println("Eamil ---> " + email3 + "\n" + "Password --->" + eService.generatePassword());
                break;
            default:
                System.out.println("Invalid Choice. Error in logic");
                break;
        }

    }

}
