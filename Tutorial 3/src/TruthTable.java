
public class TruthTable {

	public static void main(String[] args) {
		boolean p=false,q=false;
		boolean implies=!p||q;
		System.out.println("truth table for Implication");
		System.out.println("-----------------------------------------");
		System.out.println("p\t q\t p implies q");
        
		System.out.println(p+"\t" +q+"\t" +implies);
        p=false;q=true;
        implies=!p||q;
        System.out.println(p+"\t"+q+ "\t"+implies);
        
        p=true;q=false;
        implies=!p||q;
        System.out.println(p+"\t"+q+ "\t"+implies);
        
        p=true;q=true;
        implies=!p||q;
        System.out.println(p+"\t"+q+ "\t"+implies);
	   
	}

}
