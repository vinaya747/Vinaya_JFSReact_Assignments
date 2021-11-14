package CoreJavaAssignment6;


	import java.util.*;
	public class MainClassTreeMap {

		public static void main(String[] args) {
			
			Contact c=new Contact("sanju","sanju@gmail.com","male");
			Contact c1=new Contact("manju","manju@gmail.com","female");
			Contact c2=new Contact("ranju","ranju@gmail.com","female");
			
			TreeMap<Long,Contact> tm = new TreeMap<Long,Contact>();
			tm.put(9988776655l, c);
			tm.put(5577664455l, c1);
			tm.put(6655449988l, c2);
			System.out.println(tm);
			for(Map.Entry m:tm.entrySet())
			{
				Object l=m.getKey();
				Contact d=(Contact)m.getValue();
				System.out.println(l);
				System.out.println(d.name+" "+d.email+" "+d.Gender);
				
			}
			}


}
