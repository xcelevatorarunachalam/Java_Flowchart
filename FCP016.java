import java.util.*;
public class FCP016{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if (year%4==0){
if (year%100==0){
if (year%400==0){
System.out.println("yes");
}else{
System.out.println("no");}
}else{
System.out.println("yes");}
}else{
System.out.println("no");
}}}