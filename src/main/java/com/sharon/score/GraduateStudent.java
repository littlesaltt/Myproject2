package com.sharon.score;
//針對Jane寫的
public class GraduateStudent extends Student { //繼承
    int thesis; //Jane論文(thesis)分數
    public GraduateStudent (String name){
        super(name);//呼叫 Students
    }

    public GraduateStudent(String name,int englishs,int maths, int thesis){
        super(name, englishs, maths);
        this.thesis=thesis;
    }
    @Override //覆寫檢查
    public void print(){
        System.out.println(name+"\t"+englishs+"\t"+maths);
    }

    public void test(){

    }


}
