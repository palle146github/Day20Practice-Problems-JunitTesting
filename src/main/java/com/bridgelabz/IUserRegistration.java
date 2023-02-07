package com.bridgelabz;

public interface IUserRegistration {
    public boolean validateFName(String fName);
    public boolean validateLname(String LName);
    public boolean valdateEmail(String email);
    public boolean validatephoneNumber(String phone);
    public boolean validatePwd(String pwd);
}
