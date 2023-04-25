package com.company;

class Account{
    public String name;
    protected String email;  //only current package and subclasses in other package
    private String password;  //no one can access outside the class

    //to access these private ...we use getter and setter
    //getter
    public String getPassword(){
        return this.password;
    }

    //setter
    public void setPassword(String pass){
        this.password = pass;
    }

}

public class OOPS_3_encapsulation_apniKaksha {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna college";
        a1.email = "apna@college";
//        a1.password = "harsh"  //will give error
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
