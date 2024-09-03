public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int a,b,c;
            a=10;
            b=0;
            c=a/b;
        } catch (Exception e) {
            
            System.out.println(e);
        }
        finally{
            System.out.println("program executed");
        }
        /*final int a=10;
        a=6;
        System.out.println(a);*/
    
    }

}
