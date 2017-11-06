
public class EzArr {

	public static void main(String[] args) {
	EzLink[] ezCards= new EzLink[10];
	EzLink card1  = new EzLink("4567", 20.0);
	EzLink card3 = new EzLink("4321", 25.0);
	EzLink card7  = new EzLink("9876", 28.0);
	ezCards[0]=card1;
	ezCards[2]=card3;
	ezCards[7]=card7;
    for(int i=0;i<ezCards.length;i++){
    	if(ezCards[i]!=null){
    		ezCards[i].balance-=1.20;
    		ezCards[i].Display();
    	}
    }
    
    int count =0;
    for(int i=0;i<ezCards.length;i++){
    	if(ezCards[i]!=null){
    		if(ezCards[i].balance>2&&ezCards[i].balance<8){
    			count++;
    		}
    	}
    }
    System.out.println(count);
	}

}
