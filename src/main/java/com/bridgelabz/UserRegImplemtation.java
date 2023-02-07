package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegImplemtation implements IUserRegistration {
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean validateFName(String fName) {
        String validFirstName = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pat = Pattern.compile(validFirstName);
        if(pat.matcher(fName).matches()) {
            System.out.println("Input is valid!!");
            return true;
        }else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }
    @Override
    public boolean validateLname(String lName) {
        String validLastName = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pat = Pattern.compile(validLastName);
        if(pat.matcher(lName).matches()) {
            System.out.println("Input is valid!!");
            return true;
        }else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }

    @Override
    public boolean valdateEmail(String email) {
        String ValidEmail = "^[a-z0-9]{1,}[+.-]?([a-z0-9])+[@]([a-z0-9]{1,})+([.][a-z]{2,})([.][a-z]{2,3})?$";
        Pattern pat = Pattern.compile(ValidEmail);
        if(pat.matcher(email).matches()) {
            System.out.println("Input is valid!!");
            return true;
        }else {
            System.out.println("Input is Invalid!!");
            return false;
        }

    }

    @Override
    public boolean validatephoneNumber(String phone) {
        String validPhoneNumber  = "^([1-9]{2})[ ]([1-9])([0-9]{9})$";
        Pattern pat = Pattern.compile(validPhoneNumber);
        if(pat.matcher(phone).matches()) {
            System.out.println("Input is valid!!");
            return true;
        }else {
            System.out.println("Input is Invalid!!");
            return false;
        }

    }

    @Override
    public boolean validatePwd(String pwd) {

        String validPwd = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
        Pattern pat = Pattern.compile(validPwd);
        if(pat.matcher(pwd).matches()) {
            System.out.println("Input is valid!!");
            return true;
        }else {
            System.out.println("Input is Invalid!!");
            return false;
        }

    }

    public void clearAllSampleEmail() {
        UserRegImplemtation emailCheck = new UserRegImplemtation();
        System.out.println("Checking all Valid Sample!!!");
        emailCheck.valdateEmail("abc@yahoo.com");
        emailCheck.valdateEmail("abc-100@yahoo.com");
        emailCheck.valdateEmail("abc.100@yahoo.com");
        emailCheck.valdateEmail("abc111@abc.com");
        emailCheck.valdateEmail("abc-100@abc.net");
        emailCheck.valdateEmail("abc.100@abc.com.au");
        emailCheck.valdateEmail("abc@1.com");
        emailCheck.valdateEmail("abc@gmail.com.com");
        emailCheck.valdateEmail("abc+100@gmail.com");
        System.out.println();
        System.out.println("Checking all InValid Sample!!!");
        emailCheck.valdateEmail("abc");
        emailCheck.valdateEmail("abc@.com.my");
        emailCheck.valdateEmail("abc123@gmail.a");
        emailCheck.valdateEmail("abc123@.com");
        emailCheck.valdateEmail(".abc@abc.com");
        emailCheck.valdateEmail("abc()*@gmail.com");
        emailCheck.valdateEmail("abc123@.com.com");
        emailCheck.valdateEmail("abc@%*.com");
        emailCheck.valdateEmail("abc..2002@gmail.com");
        emailCheck.valdateEmail("abc.@gmail.com");
        emailCheck.valdateEmail("abc@abc@gmail.com");
        emailCheck.valdateEmail("abc@gmail.com.1a");
        emailCheck.valdateEmail("abc@gmail.com.aa.au");
        System.out.println();
    }
}

