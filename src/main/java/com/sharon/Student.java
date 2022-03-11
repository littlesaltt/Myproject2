package com.sharon;

public class Student {
    String name;
    int englishs;
    int maths;

    public Student(String name){ //constructor建構子
        this.name=name; //繼承這邊
    } //打super name就不須這串
    public Student(String name,int englishs,int maths){//default constructor
        this(name);
        //this.name=name; 因為上面有了
        this.englishs=englishs;
        this.maths=maths;
    }

    public void print(){
        int average =(englishs+maths)/2;
        System.out.print(name+"\t"+englishs+"\t"+maths+"\t"+average); //星星在旁邊就不能用ln
        if(average<60){
            System.out.print("*");
        }

        System.out.println();
    }

}
