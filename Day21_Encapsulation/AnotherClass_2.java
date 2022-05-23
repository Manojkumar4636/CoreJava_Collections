package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class AnotherClass {
	
	public static void main(String[] args) {
		
		List<EncapsulationPractice> list = new ArrayList<>();
		
		EncapsulationPractice call = new EncapsulationPractice();
		call.setAtmCardNo(434678390);
		call.setAtmPin(1123);
		
		list.add(call);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("ATM CARD NO: "+list.get(i).getAtmCardNo());
			System.out.println("ATM PIN NO: "+list.get(i).getAtmPin());
		}
	}

}
