/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Random;
import model.Department;
import model.Employee;

/**
 *
 * @author toast
 */
public class EmailService {

    String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String specialCharacters = "!@#$%^&*_=+-/.?<>)";

    String values = capitalLetters + smallLetters + numbers + specialCharacters;

    public String generateEmailAddress(Employee employee, Department department) {
        String email = employee.getFirstName() + employee.getLastName() + "@" + department.getDepartment() + ".email.com";
        return email;
    }

    public String generatePassword() {
        Random random = new Random();
        char[] pass = new char[8];
        for (int i = 0; i < pass.length; i++) {
            pass[i] = values.charAt(random.nextInt(values.length()));
        }
        System.out.println(" asd :::: "+pass.length);
        return String.valueOf(pass);
    }

}
