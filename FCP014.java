import java.util.*;
public class FCP014{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int max=0;
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
if(x>y){
max=x;
}
else{
max=y;
}
if(max>z){
System.out.println(max);
}
else{
System.out.println(z);
}}}