public class arraybound {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        int i,s=0;
        try {
            for(i=0;i<=num.length;i++){
                s=s+num[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("program executed successfully");
        }
    }
    
}
