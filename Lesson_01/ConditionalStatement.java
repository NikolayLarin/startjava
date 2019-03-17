public class ConditionalStatement {
	public static void main (String[] args) {
		int myAge = 45;
		if (myAge > 20){
			System.out.println("My age is over 20 years old, I'm " + myAge +".");
		}
		boolean isMale = true;
		if (isMale == true) {
			System.out.println("I'm a man.");
		}
		boolean isShemale = true;
		if (isShemale == true) {
			System.out.println("I'm a woman.");
		}
		float myHeight = 1.72f;
		if (myHeight<1.8) {
			System.out.println("My height is less than 1.8 meters.");		
		} else {
			System.out.println("My height is more than 1.8 meters.");
		}
		char myNameFirstLetter= 'N';
		if (myNameFirstLetter == 'M'){
			System.out.println("The first letter of my name is M.");
		} else if (myNameFirstLetter =='N') {
			System.out.println("The first letter of my name is N.");
		} else {
			System.out.println("The first letter of my name is " + myNameFirstLetter + ".");
		}		
	}
}