
public class SeventeenthAssignment {

	public static void main(String[] args) {
	
		circle cir=new circle();
		cir.findArea();
        cir.findPerimeter();		
	
        rectangle rect=new rectangle();
        rect.findArea();
        rect.findPerimeter();
        
        triangle tri=new triangle();
        tri.findArea();
        tri.findPerimeter();
	}

}

 abstract class figure
 {
	 static	int r=7,a=100,b=50,c=50;
	static	double area;
	static double perimeter;
static	double dim1=3.14;
	
	
	abstract void findArea();
	abstract void findPerimeter();
}
 class circle extends figure
 {
	 
	 
	  void findArea()
	 {
		  
	area=dim1*r*r;	  
		 System.out.println("the area of circle is  "+area);
	 }
 
	  void findPerimeter()
	  {
		  perimeter=2*(dim1*r);
			 System.out.println("the perimeter of circle is  "+perimeter);
	  }
}
 
 class rectangle extends figure
 {
	 
	 
	  void findArea()
	 {
		  
	area=a*b;	  
		 System.out.println("\nthe area of rectangle is  "+area);
	 }
 
	  void findPerimeter()
	  {
		  perimeter=2*(a+b);
			 System.out.println("the perimeter of rectangle is  "+perimeter);
	  }
}
 
 class triangle extends figure
 {
	 
	 
	  void findArea()
	 {
		  
	area=(a*b)/2;	  
		 System.out.println("\nthe area of triangle is  "+area);
	 }
 
	  void findPerimeter()
	  {
		  perimeter=a+b+c;
			 System.out.println("the perimeter of triangle is  "+perimeter);
	  }
}
 