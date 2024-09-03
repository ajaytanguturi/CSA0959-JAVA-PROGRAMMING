import java.util.*;
class sorting{
public static void main(String args[]){
int size,i,j;
char c;
String temp;
Scanner s=new Scanner(System.in);
System.out.println("enter no of searching elements req: ");
size=s.nextInt();
s.nextLine();
String[] data=new String[size];
for(i=0;i<size;i++){
System.out.println("enter string" +(i+1));
data[i]=s.nextLine();
}
System.out.println("choose either ascending order or descending order ");
c=s.next().charAt(0);
switch(c){
case 'a':
for(i=0;i<size;i++){
for(j=i+1;j<size;j++){
if(data[j].compareTo(data[i])<0){
temp=data[i];
data[i]=data[j];
data[j]=temp;
}
}
}
break;
case 'd':
for(i=0;i<size;i++){
for(j=i+1;j<size;j++){
if(data[j].compareTo(data[i])>0){
temp=data[i];
data[i]=data[j];
data[j]=temp;
}
}
}
break;
default:
System.out.println("enter valid choice!");
break;
}
System.out.println("After sorting");
for(i=0;i<size;i++){
System.out.println(data[i]);
}
}
}
