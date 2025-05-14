class Complex
{
 double real;
 double img;
 Complex()
{ real=0;
 img=0;
}
Complex(double a, double b)
{
 this.real=a;
 this.img=b;
}
void setComplex( double a, double b)
{
  this.real=a;
  this.img=b;
}
void showComplex()
{
 System.out.println("The real part of the complex number is :" +real);
  System.out.println("The img part of the complex number is :" +img+ " i");
}
public String toString()
{ return real+"+"+img+"i";
}
Complex Addition( Complex c)
{
Complex t=new Complex();
 t.real= this.real + c.real;
 t.img = this.img + c.img;
 return t;
}
Complex Subtraction( Complex c)
{
Complex t=new Complex();
 t.real= this.real - c.real;
 t.img = this.img - c.img;
 return t;
}
Complex Multiplication(Complex c)
{
  Complex t=new Complex();
  t.real=this.real*c.real-this.img*c.img;
  t.img=this.real*c.img+this.img*c.real;
 return t;
}
Complex Division(Complex c)
{
   Complex t=new Complex();
  t.real=(this.real*c.real+this.img*c.img)/(c.real*c.real+c.img*c.img);
  t.img=(this.img*c.real-this.real*c.img)/(c.real*c.real+c.img*c.img);
  return t;
}
public static void main(String[] args)
	{
		Complex c1= new Complex(3,2);
		Complex c2= new Complex(5,6);
                c1.showComplex();
                c2.showComplex();
                System.out.println("(Real,Img) = "+c1.toString());
		System.out.println("(Real,Img) = "+c2.toString());
		Complex c3  = c1.Addition(c2);
		System.out.println("Addition = "+c3.toString() );
                Complex c4  = c1.Subtraction(c2);
		System.out.println("Subtraction = "+c4.toString() );
                Complex c5  = c1.Multiplication(c2);
		System.out.println("Multiplication = "+c5.toString() );
                Complex c6  = c1.Division(c2);
		System.out.println("Division = "+c6.toString() );
	
	
	}
}

