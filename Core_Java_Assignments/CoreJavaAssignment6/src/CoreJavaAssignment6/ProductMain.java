package CoreJavaAssignment6;


import java.util.*;
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product p1=new Product(100,"Redmi5",10);
    Product p2=new Product(105,"Redmi6",90);
    Product p3=new Product(102,"Redmi5",90);
    Product p4=new Product(104,"Redmi5",90);
    Product p5=new Product(106,"Redmi5",90);
    Product p6=new Product(107,"Redmi5",90);
    Product p7=new Product(101,"Redmi5",90);
    Product p8=new Product(100,"Redmi5",90);
    Product p9=new Product(109,"Redmi5",90);
    Product p10=new Product(110,"Redmi5",90);
    
    
    HashSet<Product> hs=new HashSet<Product>();
    hs.add(p1);
    hs.add(p2);
    hs.add(p3);
    hs.add(p4);
    hs.add(p5);
    hs.add(p6);
    hs.add(p7);
    hs.add(p8);
    hs.add(p9);
    hs.add(p10);
    

    for(Product p:hs)
    {
    	System.out.println(p.id+" "+p.Productname+" "+p.quantity);
    }
    System.out.println();
    hs.add(p6);
    
    for(Product p:hs)
    {
    	System.out.println(p.id+" "+p.Productname+" "+p.quantity);
    }
    System.out.println();
   
	}

}
