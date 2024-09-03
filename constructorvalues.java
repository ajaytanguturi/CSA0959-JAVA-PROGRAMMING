class superclass{
     int value;
    superclass(int value){
        this.value=value;
    }
    public void display(){
    System.out.println("super class value:"+value);
}
}
class subclass extends superclass{
    int value;
    subclass(int supervalue,int subvalue){
        super(supervalue);
        this.value=subvalue;
    }
        public void display(){
        System.out.println("subclass value is: "+value);
        System.out.println("superclass value is: "+super.value);
        }
    }
class constructorvalues{
    public static void main (String args[]){
        subclass s=new subclass(10,20);
        s.display();
    }
}
