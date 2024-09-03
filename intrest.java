abstract class bank{
    abstract double getROI();
}
class sbi extends bank{
    double getROI(){
        return 8.3;
    }
}
class icici extends bank{
    double getROI(){
        return 7.4;
    }
}
class axis extends bank{
    double getROI(){
        return 9.7;
    }
}
public class intrest {
    public static void main(String[] args) {
        bank b1=new sbi();
        bank  b2= new icici();
        bank  b3=new axis();
        System.out.println("rate of intrest of sbi "+b1.getROI());
        System.out.println("intrest for icic "+b2.getROI());
        System.out.println("intrest for axis is "+b3.getROI());

    }
    
}
