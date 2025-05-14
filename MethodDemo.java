class MethodDemo{
public static void main(String[] args) {
int a = 10, b=20,c;
MethodDemo md = new MethodDemo();
c= md.add(a,b);
System.out.println("a+b="+c);
 }//main()
int add(int i, int j){
         return i+j;
 } 
}