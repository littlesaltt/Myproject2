package com.sharon.score;

public class ScoringNG {
    public static void main(String[] args) {
        int[] englishs={77,80,64,90,40};
        int[] maths={100,68,74,84,55};
        String[] names={"kate","Jane","Kevin","Hank","Elsa"};
        for (int i = 0; i < 5; i++) {
            if(i!=1){
                System.out.println(names[i] +"\t"+englishs[i]+"\t"+maths[i]+"\t"+(englishs[i]+maths[i])/2);
        }



        }
    }
}
