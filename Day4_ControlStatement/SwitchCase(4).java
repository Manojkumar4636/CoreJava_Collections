package com.learn.java.day4;

//Define Switch case Condition
//It is like an if-else-if statement

public class SwitchCase {
	
	String hero = "Vijay";
	
 private void myFavHero() {
	switch (hero) {
	case "Allu Arjun":
		System.out.println("Correct");
		break;
	case "Ajith" :
		System.out.println("Correct");
		break;
	case "Suriya":
		System.out.println("Correct");
		break;
	case "STR":
		System.out.println("Correct");
		break;
		
	default:
		System.out.println("I'm not find your hero");
		break;
	}
	

}
 public static void main(String[] args) {
	 SwitchCase hero = new SwitchCase();
	 hero.myFavHero();
}
}


/*OUTPUT
--------
I'm not find your hero
*/