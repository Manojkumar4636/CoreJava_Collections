/*In Java, every method is declared with a return type such as int, float, double, sting..etc. These return types
required a return statement at the end of the method.

void return type is (do not return anything)
*/

package com.learn.java.day2;

       //Define ReturnType

public class CollectAmount {
	Integer collectedAmount = 1000;
	
	private Integer collectAmountAndGivetItToMe() {
		System.out.println("Daddy have collected amount "+collectedAmount +" and sent it to you");
		return collectedAmount;
	}
	public static void main(String[] args) {
		CollectAmount mySon = new CollectAmount();
		Integer collectAmountAndGivetItToMe = mySon.collectAmountAndGivetItToMe();
		System.out.println("Got the amount son "+collectAmountAndGivetItToMe);
	}

}
