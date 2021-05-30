package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReceivingBillPayment implements bank{
public void bank_info() {
	List <String> bank=new ArrayList<String>();
	bank.add("Bank MCB");
	bank.add("I.I Chandigar Road, Clifton ");
	bank.add("0213456778");
	System.out.println("Name of the Bnak:"+bank.get(0));
	System.out.println("Address of the Bank"+bank.get(1));
	System.out.println("Phone"+bank.get(2));
}
public void ReceivingBillPayment() {
	List<Double> j = new ArrayList<Double>();
	Scanner sc=new Scanner(System.in);
	for(int i=0; i>5; i++) {
		j.add(sc.nextDouble());
	}

System.out.println("Bill payment recived: "+j);
}
}
