package com.sharon;

public class Scoring {
    public static void main(String[] args) {
        Student Kevin=new Student("Kevin",20,20); //對應建構子
        Student Hank= new Student("Hank", 90,84);
        GraduateStudent Jane= new GraduateStudent("Jane"); //本身就繼承了
        //Student Jane= new Student("Jane",80,68);
        //Jane.thesis=80;
        //Kevin.name="Kevin";
        //Kevin.englishs=20;
        //Kevin.maths=20;
        Kevin.print();
        Hank.print();
        Jane.print();



    }
}
