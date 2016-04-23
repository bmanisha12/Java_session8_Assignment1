import java.util.*;
public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Reema");//adding object in arraylist  
		  al.add("Dhaval");  
		  al.add("Ayush");  
		  al.add("Harold");
		  System.out.println("\n ArrayList elements are as follows: ");
		  Iterator it = al.iterator();
		  while(it.hasNext())
			  System.out.println("\n "+it.next());
	}

}
