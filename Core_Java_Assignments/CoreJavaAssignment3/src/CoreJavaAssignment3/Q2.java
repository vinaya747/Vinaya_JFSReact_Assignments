package CoreJavaAssignment3;


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			 int a=6;
				int b=0;
             System.out.println(a/b);  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(UnsupportedOperationException e)  
               {  
                System.out.println("UnsupportedOperation Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("Dividend not divisible by 0"); 
	}

}
