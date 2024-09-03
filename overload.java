public class overload {
    /*void add(int a,int b){
        a=10;
        b=5;
        int c=a+b;
        System.out.println(c);
    }
    void add(int a){
        a=10;
        System.out.println(a);
    }*/
    void add(int a,double b){
        a=10;
        b=5.7;
        double c=a+b;
        System.out.println(c);
    }
    void add(double a,int b){
        a=1.5;
        b=3;
        double c=a+b;

        System.out.println(c);
    }
    public static void main(String[] args) {
        overload o=new overload();
        o.add(10,5.7);
    }

    
}
