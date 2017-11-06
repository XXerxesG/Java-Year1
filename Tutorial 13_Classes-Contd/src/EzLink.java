
public class EzLink {
public String cardno;
public double balance;

public EzLink(String card, double b) {
	cardno=card;
	balance=b;
}
public void Display(){
	System.out.println("Card Number :"+cardno);
	System.out.println("Balance :" +balance);
}
	public static void main(String[] args) {
	EzLink e= new EzLink("YAYA",12.3);
	e.Display();

	}

}
