public class converter {

	public static double celsiusToFahrenheit(int F){
		return F * (5 / 9.0) - 32;
	}


	public static double fahrenheitToCelsius(int C){
		return C * (9 / 5.0) + 32;
	}

	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(24));
		System.out.println(fahrenheitToCelsius(59));
	}
	
}
