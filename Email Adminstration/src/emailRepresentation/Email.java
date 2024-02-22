package emailRepresentation;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String email;
    private int defaultPasswordLength = 10;

    private String compnaySuffix = "anycompany.com";
    private String alternativeEmail;

    //tasks
    //constructor to receive name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randPassword(defaultPasswordLength);
        System.out.println("Generated Password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "." + department +"@" + compnaySuffix;
        System.out.println("Your email is: " + email);
    }
    //ask for dept

    public String setDepartment(){
        System.out.print("Enter the department: \n1 for sales \n2 for IT \n3 for accounting \n4 for none");
        Scanner input = new Scanner(System.in);
        int deptChoice = input.nextInt();
        if(deptChoice==1){
            return "sales";
        }

        else if(deptChoice==2){
            return "dev";
        }

        else if(deptChoice==3){
            return "accounting";
        }

        else{
            return "";
        }

    }
    // Generate random password

    public String randPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];

        Random random = new Random();

        for(int i = 0; i<length; i++){
            int rand = random.nextInt(passwordSet.length());
            password[i]= passwordSet.charAt(rand);
        }

        return new String(password);
    }

    //set mainbox capacity

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    //set alteramtive email

    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail= altEmail;
    }

    //change password

    public void changePassword(String Password){
        this.password=password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternativeEmail(){
        return alternativeEmail;
    }

    public String getPassword(){
        return password;
    }

    //Display all Information

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + " " +
                "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailBoxCapacity + "mb";
    }
}
