package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Teacher belachew = new Teacher(1, "Belachew", 500);
        Teacher bekele = new Teacher(2, "Bekele", 700);
        Teacher beyene = new Teacher(3, "Beyene", 1000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(beyene);
        teacherList.add(bekele);
        teacherList.add(belachew);
        
        
        Student missy = new Student(1, "Missy", 5);
        Student meron = new Student(2, "Meron", 12);
        Student mola = new Student(3, "Mola", 9);
        
        List<Student> studentList = new ArrayList<>();
        
        studentList.add(meron);
        studentList.add(missy);
        studentList.add(mola);
        
        School ghs = new School(teacherList, studentList);
         
        
        missy.payFeesPaid(500);
       
        mola.payFeesPaid(2414);
        
        System.out.println("Total money earned by ghs is: " + ghs.getTotalMoneyEarned() + ".");
   
        System.out.println("---Making GHS pay Salary---");
        
        bekele.receiveSalary(200);
        
        System.out.println("GHS bas spent for salary to" + bekele.getName()+ "has earned" + ghs.getTotalMoneyEarned());
    }

}
