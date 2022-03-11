package com.sharon;

public class GraduateStudent extends Student { //繼承
    int thesis;
    public GraduateStudent (String name){
        super(name);//呼叫 Students
    }

    public GraduateStudent(String name,int englishs,int maths, int thesis){
        super(name, englishs, maths);
        this.thesis=thesis;
    }

}
