

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  

    public static void main(final String[] args) {
        String e = "12345678901234567890"; // Replace with your actual string
        for (int i = 2; i < e.length(); i++) {
            long dNum = Long.parseLong(e.substring(i, i + 10));
            if (isPrime(dNum)) {
                System.out.println(dNum);
                break;
            }
        }
    }

    public static boolean isPrime(long dNum) {
        if (dNum > 1) {
            for (int i = 2; i <= Math.sqrt(dNum); i++) {
                if (dNum % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
}

}

