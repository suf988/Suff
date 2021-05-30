package src;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class OpeningNewAccounts implements bank {

	@Override
	public void bank_info() {
		List <String> bank=new ArrayList<String>();
		bank.add("Bank MCB");
		bank.add("I.I Chandigar Road, Clifton ");
		bank.add("0213456778");
		System.out.println("Name of the Bnak:"+bank.get(0));
		System.out.println("Address of the Bank"+bank.get(1));
		System.out.println("Phone"+bank.get(2));
		
	}
public void a_acc() {
	Scanner sc=new Scanner (System.in);
	Queue<String> s=new LinkedList<String>();
	
	for(int i=0; i<4; i ++) {
		System.out.println("user"+s);
		s.add(sc.next());
	}

	System.out.println("here is the complete information of the user");
	System.out.println(s);
}

public static void main (String[] args) {
	 OpeningNewAccounts see=new  OpeningNewAccounts();
	 see.bank_info();
	 see.a_acc();
}
}
