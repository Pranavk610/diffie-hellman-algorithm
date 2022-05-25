import java.util.*;
import java.math.*;
class deffie{

public static void main(String[] ae){

double prime,pvt_key_a,pvt_key_b,pub_key_a,pub_key_b,sec_no_a,sec_no_b,root;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Prime no:");
prime=sc.nextDouble();
System.out.println("Enter Primtive root:");
root=sc.nextDouble();
System.out.println("Enter Pvt key a:");
pvt_key_a=sc.nextDouble();
System.out.println("Enter Pvt key b:");
pvt_key_b=sc.nextDouble();
pub_key_a=Math.pow(root,pvt_key_a)%prime;
pub_key_b=Math.pow(root,pvt_key_b)%prime;

sec_no_a=Math.pow(pub_key_a,pvt_key_b)%prime;
sec_no_b=Math.pow(pub_key_b,pvt_key_a)%prime;
if(sec_no_a==sec_no_b){

System.out.println("Can Communicate");

System.out.println("Secret no is:"+sec_no_a);
}
else{

System.out.println("Cannot Communicate");
}}
}