import java.util.*;
public class FCP026{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int sum=0;
int x,y;
if(n>m){
x=n;
y=m;}
else{
x=m;
y=n;
}
while(x>=y){
sum=sum+y;
y++;
}
System.out.println(sum);}}

