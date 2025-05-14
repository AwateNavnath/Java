import java.util.*;
public class PowerMethodDemo1{
public static void main(String[] args){
     int num, pow, res;
     Scanner sc= new Scanner(System.in);
     System.out.print("enter num:");
     num=sc.nextInt();
     System.out.println("enter pow:");
     pow=sc.nextInt();
     PowerMethodDemo1 pmd=new PowerMethodDemo1();
     res = pmd.power(num, pow);
     System.out.print("ans="+res);
  } //main()
int power(int a, int b){
int i, r = 1;
for(i=1;i<=b ; i++)
 {
        r = r * a;
  }
 return r;
 }
}
