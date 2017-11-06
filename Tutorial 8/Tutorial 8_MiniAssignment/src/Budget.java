import java.util.Scanner;
public class Budget {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    double bank,total=0;
		double income[],expense[];
		income=new double[12];
		expense=new double[12];
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("Welcome");
		System.out.print("Please enter your Current Bank Balance  :");
		System.out.println("--------------------------------------------------------");
		bank=s.nextDouble();
		total=+bank;
		System.out.println("Enter your interest  :");
		System.out.println("---------------------------------------------------------");
		int inter=s.nextInt();
		System.out.println("---------------------------------------------------------");
		for(int i =0;i<12;i++){
			
			System.out.println("Enter your income for  "+month[i]);
		    income[i]=s.nextInt();
		    System.out.println("Enter your expense for "+month[i]);
		    expense[i]=s.nextInt();
		    if(expense[i]>(income[i]+bank)){
		    	System.out.println("ERROR!! ERROR!!");
		        System.out.println("Enter your expense for Month "+(i+1));
				    expense[i]=s.nextInt();
		    
		    } total+=income[i];
		    System.out.println("Your total is income is: " +total);
		  
		}
		int spend=0;
		for(int i=0;i<12;i++)
		{
			spend+=expense[i];
		}
        System.out.println("Total money spent in the year $ "+spend);
        double avg=0;
        avg=spend/12;
        double low=0,high=0;
        int c1=0,c2=0;
        for(int i=0;i<12;i++){
        	if(expense[i]>high){
        		high=expense[i];
        		c1=i;
        	}
        	if(low==0){
        		low=expense[i];
        		c2=i;
        	}
        	if(expense[i]<low){
        		low=expense[i];
        		c2=i;
        	}
        }
        System.out.printf("Month with the highest expense is  %s %n The highest amount spent is $ %.2f %n",month[c1],high);
        System.out.printf("Month with the lowest expense is  %s The lowest amount spent is $ %.2f %n",month[c2],low);
        double val=0;
        val=bank*inter/100;
        bank+=val;
        double balance=(bank+total)-spend;
        System.out.println("Total money after expenditure is "+balance);
	}

}
