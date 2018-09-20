public class converter {

	public static int CtoF(int F){
		return F * (5 / 9.0) - 32;
	}


	public static int FtoC(int C){
		return C * (9 / 5.0) + 32;
	}

	public static void main(String[] args) {
		System.out.println(CtoF(24));
		System.out.println(FtoC(59));
	}
	
}