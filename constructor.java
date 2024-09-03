public class constructor {
    constructor(int a,int b){
        a=10;
        b=3;
    }/*
    constructor(){
    }
     */
    void add(int a,int b){
        a=7;
        b=2;
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        constructor s=new constructor(7, 5);
        s.add(1,2);
        //constructor s= new constructor();
        //s.add(3,5);
    }
}
