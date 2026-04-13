public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(repeatLetter('a', 8));
		System.out.println(countLetter("hello", 'l'));
		System.out.println(evenSum(3, 8));
	}

	public static String repeatLetter(char eb, int uh){
		String buh;
		buh = "";
		for (int ugh = 0; ugh < uh; ugh++){
			buh += eb;
		}
		return buh;
	}

	public static int countLetter(String bih, char eb){
		String wrn = bih;
		int chuh = 0;
		int num = 0;
		for (int gih = bih.length(); num < gih; num++){
			if (bih.charAt(num) == eb){
				chuh++;}

			
		}


		return chuh;
	}


	public static int evenSum(int num1, int num2){
		int num = 0;
		if (num1 < num2){
			for (int st = num1; st <= num2; st++){
				if (st%2==0){
					num += st;}
				}
		}
		else{
			for (int st = num2; st <= num1; st++){
				if (st%2==0){
					num += st;}
				}
		}
		return num;
	}


	

}
