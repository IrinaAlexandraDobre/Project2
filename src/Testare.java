
public class Testare {

	public static void main(String[] args) {
		// OPTIMIZARE
		System.out.println("==== Testare proiect 2 ====");
		System.out.println();
		
		LazyNumberDetails lnd;
		lnd = new LazyNumberDetails(23);
		
		//nr prim
		System.out.println("==== Testare numar prim ====");
		lnd.updateNumber(10); 
		lnd.isPrime();       
		lnd.isPrime();        
		lnd.isPrime(); 
		lnd.isPrime(); 
		
		lnd.updateNumber(13); 
		lnd.isPrime(); 
		lnd.isPrime(); 
		
		lnd.updateNumber(10); 
		lnd.isPrime(); 
		lnd.isPrime(); 		


		//nr perfect
		System.out.println("==== Testare numar perfect ====");
		lnd.updateNumber(6); 
		lnd.isPerfect(); 
		lnd.isPerfect(); 
		
		lnd.updateNumber(14); 
		lnd.isPerfect(); 
		lnd.isPerfect(); 
		
		//nr magic
		System.out.println("==== Testare numar magic ====");
		
		lnd.updateNumber(3); 
		lnd.isMagic(); 
		lnd.isMagic(); 
		lnd.isMagic();
		
		lnd.updateNumber(12); 
		lnd.isMagic(); 
		lnd.isMagic(); 
		lnd.isMagic();
	
	}

}
