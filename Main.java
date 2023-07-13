package Student_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
        Teacher pragati = new Teacher(1,"Pragati",8000);
        Teacher laxmi = new Teacher(2,"Laxmi",4000);
        Teacher vishal = new Teacher(3,"Vishal",9000);
        
        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(pragati);
        teacherList.add(laxmi);
        teacherList.add(vishal);


        Student sakshi = new Student(1,"Sakshi",4);
        Student vaishnavi = new Student(2,"Vaishnavi",12);
        Student swara = new Student(3,"Swara",5);
       
        
        List<Student> studentList = new ArrayList<>();

        studentList.add(sakshi);
        studentList.add(swara);
        studentList.add(vaishnavi);


        School viit = new School(teacherList,studentList);

        
        sakshi.payFees(250000);
        vaishnavi.payFees(60000);
        System.out.println("VIIT has earned $"+ viit.getTotalMoneyEarned());
        System.out.println();
        
        System.out.println("------FEES PAID AND SALARY DISTRIBUTED-----");
        System.out.println();
        
        System.out.println(vaishnavi);
        System.out.println("Remaining fees of Vaishnavi is : $" + vaishnavi.getRemainingFees());
        System.out.println(swara);
        System.out.println("Remaining fees of Swara is : $" + swara.getRemainingFees());
        System.out.println(sakshi);
        System.out.println("Remaining fees of Sakshi is : $" + sakshi.getRemainingFees());
        
        
        
        System.out.println();


        
        pragati.receiveSalary(pragati.getSalary());
        System.out.println("VIIT has spent for salary to " + pragati.getName()
        +" and now has $" + viit.getTotalMoneyEarned());
        
        

        vishal.receiveSalary(vishal.getSalary());
        System.out.println("VIIT has spent for salary to " + vishal.getName()
                +" and now has $" + viit.getTotalMoneyEarned());
        
        System.out.println();


       
        

        System.out.println(vishal);
        System.out.println(pragati);
        System.out.println(laxmi);
        
        System.out.println();
        
        System.out.println("Now VIIT has $"+ viit.getTotalMoneyEarned()+ " funds remaining");


    }
}
