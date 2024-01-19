

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		 for (int i=0;i<e.length();i++){
			double sNum = 0; 
			if (isPrime(sNum) == true){
				System.out.println("The answer!");
				break;
		System.out.println("Replace this string with your answer!");
	}
	

	//Finish this function
	public boolean isPrime(double d){
		if (dnum>2){
   		 for (int i=2; i<=Math.sqrt(dnum);i++){
      		if (dnum%i==0) return false;
    		}
    		return true;
 		}
		if (dnum ==2) return true;
		return false; 
	}

}

