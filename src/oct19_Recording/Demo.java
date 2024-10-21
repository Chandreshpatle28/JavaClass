package oct19_Recording;

public class Demo {

	public static void main(String[] args) {
		
				
		String name1 = new String("Chandresh Patle ");
		
		String name = "Harish Patle ";
		
		String name2 = "HARISH PATLE";
		
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.charAt(0));
		
		//System.out.println(name.charAt(12));
		
		System.out.println(name.concat(" Baba..!!"));
		
		System.out.println(name1.concat(name).concat(" Ayansh"));
		
		System.out.println(name.equals(name1));
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println(name.indexOf('l'));
		
	    System.out.println(name.replace('l', 'k'));
	    
	    System.out.println(name1.toLowerCase());
	    
	    System.out.println(name1.toUpperCase());
	    
	    System.out.println(name1.substring(4));
	    
	    System.out.println(name1.substring(4, 7));
        //overloading
	    
	    String name3 = "   Anshika Patle  ";
	    System.out.println(name3);
	    System.out.println(name3.trim());

	}

}
