class student{
    int m1,m2,tot;
    student(int mark1,int mark2){
        m1=mark1;
        m2=mark2;
    }
}
class total extends student{
    int tot=m1+m2;
    void display(){
        System.out.println("total: "+tot);
    }
}
public class totalmarks {
    public static void main(String[] args){
        total t(80,100);
        t.display();
      
}
}
