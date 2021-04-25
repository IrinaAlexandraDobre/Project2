
public class LazyNumberDetails {

	private int number;
	//campuri care retin rezultatele obtinute in urma apelurilor metodelor principale
	//aceste campuri vor fi afisate in cazul in care metoda principala a fost deja apelata
	private boolean oldNumber;
	private boolean oldNumber2;
	private boolean oldNumber3;
	//campuri care in functie de valoarea lor sunt folosite pentru a apela metoda principala 
	//sau pentru a afisa rezultatul calculat anterior daca metoda a fost deja apelata
	private boolean isPerfectAlreadyCalculated;
	private boolean isPrimeAlreadyCalculated;
	private boolean isMagicAlreadyCalculated;

	public LazyNumberDetails(int number) {
		this.number = number;
		System.out.println("number: " + number);
		System.out.println();
	}

	public void updateNumber(int number) {
		//cand se face update campurile devin false altfel ca metoda principala va fi apelata pentru noul numar
		//daca aceste campuri raman true atunci metoda principala nu se apeleaza => afisare rezultate anterioare
		setIsPrimeAlreadyCalculated(false);
		setIsPerfectAlreadyCalculated(false);
		setIsMagicAlreadyCalculated(false);
		this.number = number;
		System.out.println("number updated: " + number);
		System.out.println();
	}
	
	public int getNumber() {
		return number;
	}
	
	//metode getter si setter pentru campurile in care stochez rezultatele 
	//si pentru campurile care imi arata daca metoda principala a fost deja apelata sau nu
	public void setNumber1(boolean var) {
		this.oldNumber = var;
	}
	
	public boolean getNumber1() {
		return oldNumber;
	}

	
	public void setIsPrimeAlreadyCalculated(boolean var) {
		this.isPrimeAlreadyCalculated = var;
	}
	
	public boolean getIsPrimeAlreadyCalculated() {
		return isPrimeAlreadyCalculated;
	}
	
	public void setNumber2(boolean var) {
		this.oldNumber2 = var;
	}
	
	public boolean getNumber2() {
		return oldNumber2;
	}
	
	public void setIsPerfectAlreadyCalculated(boolean var) {
		this.isPerfectAlreadyCalculated = var;
	}
	
	public boolean getIsPerfectAlreadyCalculated() {
		return isPerfectAlreadyCalculated;
	}
	
	public void setNumber3(boolean var) {
		this.oldNumber3 = var;
	}
	
	public boolean getNumber3() {
		return oldNumber3;
	}
	
	public void setIsMagicAlreadyCalculated(boolean var) {
		this.isMagicAlreadyCalculated = var;
	}
	
	public boolean getIsMagicAlreadyCalculated() {
		return isMagicAlreadyCalculated;
	}

	public boolean isPrimeNr() {
		boolean isPrime1 = true;
		if (getNumber() == 2) {
			isPrime1 = true;
		} else if (getNumber() % 2 == 0) {
			isPrime1 = false;
		} else {
			for (int d1 = 2; d1 <= (getNumber() / 2); d1++) {
				if (getNumber() % d1 == 0) {
					isPrime1 = false;
				}
			}
		}
		//mesaj afisat cand se apeleaza metoda principala
		System.out.println("algoritm nr prim");
		//se retine rezultatul apelarii metodei in setNumber1
		setNumber1(isPrime1);
		// metoda a fost apelata deja astfel ca setIsPrimeAlreadyCalculated devine true
		setIsPrimeAlreadyCalculated(true);
		System.out.println(isPrime1);
		System.out.println();
		return isPrime1;
	}
	
	public boolean isPrime() {
		// daca getIsPrimeAlreadyCalculated() este true, atunci nu se apeleaza metoda principala isPrimeNr
		// se afiseaza direct rezultatul prin getNumber1
		// daca getIsPrimeAlreadyCalculated() este false, atunci se apeleaza metoda principala isPrimeNr
		if (getIsPrimeAlreadyCalculated() == true) {
			System.out.println(getNumber1());
			System.out.println();
			return getNumber1();
			
		}else {
			return isPrimeNr();
		}
		
		
	}

	//suma divizorilor
	public int perfectNr(int number) {
		int sumNrPerfect = 0;
		int number1 = number;
		for (int i1 = 1; i1 <= (number1 / 2); i1++) {
			if (number1 % i1 == 0) {
				sumNrPerfect += i1;
			}
		}
		return sumNrPerfect;
	}

	public boolean isPerfectNr() {
		boolean isPerfect = true;
		if (getNumber() == perfectNr(getNumber())) {
			isPerfect = true;
		} else {
			 isPerfect = false;
		}
		//mesaj afisat cand se apeleaza metoda principala
		System.out.println("algoritm nr perfect");
		//se retine rezultatul apelarii metodei in setNumber2
		setNumber2(isPerfect);
		// metoda a fost apelata deja astfel ca setIsPerfectAlreadyCalculated devine true
		setIsPerfectAlreadyCalculated(true);
		System.out.println(isPerfect);
		System.out.println();
		return isPerfect;
	}
	
	public boolean isPerfect() {
		// daca getIsPerfectAlreadyCalculated() este true, atunci nu se apeleaza metoda principala isPerfectNr
		// se afiseaza direct rezultatul prin getNumber2
		// daca getIsPerfectAlreadyCalculated() este false, atunci se apeleaza metoda principala isPerfectNr
		if (getIsPerfectAlreadyCalculated() == true) {
			System.out.println(getNumber2());
			System.out.println();
			return getNumber2();
			
		}else {
			return isPerfectNr();
		}
		
		
	}

	//un numar magic este definit ca fiind acel numar care se reduce prin insumare la una dintre cifrele magice-3,7,9
	public int reduceDigitS(int number) {
		while (number / 10 != 0) {
			int sum = 0;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			number = sum;
		}
		return number;
	}

	public boolean isMagicNr() {
		boolean isMagicVar = true;
		int result = reduceDigitS(getNumber());
		if ((result != 3) && (result != 7) && (result != 9)) {
			isMagicVar = false;
		} else {
			isMagicVar = true;
		}
		//mesaj afisat cand se apeleaza metoda principala
		System.out.println("algoritm nr magic");
		//se retine rezultatul apelarii metodei in setNumber3
		setNumber3(isMagicVar);
		// metoda a fost apelata deja astfel ca setIsMagicAlreadyCalculated devine true
		setIsMagicAlreadyCalculated(true);
		System.out.println(isMagicVar);
		System.out.println();
		return isMagicVar;
	}
	
	public boolean isMagic() {
		// daca getIsMagicAlreadyCalculated() este true, atunci nu se apeleaza metoda principala isMagicNr
		// se afiseaza direct rezultatul prin getNumber3
		// daca getIsMagicAlreadyCalculated() este false, atunci se apeleaza metoda principala isMagicNr
		if (getIsMagicAlreadyCalculated() == true) {
			System.out.println(getNumber3());
			System.out.println();
			return getNumber3();
			
		}else {
			return isMagicNr();
		}
		
		
	}

}
