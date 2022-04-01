package com.sharon.score;

import com.sharon.sales.Customer;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student("Kevin",20,20));
        students.add(new Student("Hank", 90,84));
        students.add(new GraduateStudent("Jane",80,68,75));
        for (Student s:students) { //冒號右邊放多東西
            s.print();
        }
        /*Student Kevin=new Student("Kevin",20,20); //對應建構子
        Student Hank= new Student("Hank", 90,84);
        GraduateStudent Jane= new GraduateStudent("Jane",80,68,75);*/ //多一個論文分數
        //Student Jane= new Student("Jane",80,68);
        //Jane.thesis=75;
        //Kevin.name="Kevin";
        //Kevin.englishs=20;
        //Kevin.maths=20;
        /*Kevin.print();
        Hank.print();
        Jane.print();*/



    }
}
