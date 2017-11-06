
public class Echo {

	public static void main(String[] input) {
		// TODO Auto-generated method stub
		//System.out.println(args[0]);
		/*if(input.length!=3){
			System.out.println("Error");
		}
		else{
    for (int i=0;i<input.length;i++){
    	   System.out.print(input[i]);
       }
		}*/
      int num1=Integer.parseInt(input[0]);
      int num2=Integer.parseInt(input[2]);
      String op=input[1];
      if(op.equals("+")){
    	  int answer= num1+num2;
    	  System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+answer);
    	  
      }
      else if(op.equals("-")){
    	  int answer=num1-num2;
    	  System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+answer);
      }
    	  else if(op.equals("x")){
    		  int answer=num1*num2;
    		  System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+answer);
  	  }
    	  else if (op.equals("/")){
    		  int answer=num1/num2;
    		  System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+answer);
    	  }
    		 
      }
	}


