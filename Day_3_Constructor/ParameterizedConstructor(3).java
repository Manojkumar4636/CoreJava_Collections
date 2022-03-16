/*Parameterized Constructor Explained
  =>It has arguments(parameter)*/

package com.learn.java.day3;

//Define Parameterized Constructor

public class ComputerInfo {

	String computerName;
	int computerRam;

	//Passing the Parameters
	ComputerInfo(String name, int ram){
		computerName=name;
		computerRam=ram;
	}
	private void tellComputerInfo() {
		System.out.println("Computer name is "+computerName+" and RAM is "+computerRam);
	}
	public static void main(String[] args) {
		ComputerInfo computer1 = new ComputerInfo("Acer",8);
		computer1.tellComputerInfo();

		ComputerInfo computer2 = new ComputerInfo("hp",8);
		computer2.tellComputerInfo();
	}


}
