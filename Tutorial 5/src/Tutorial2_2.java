
public class Tutorial2_2 {
    public static void main(String args[]){
        int sum = 0;      // store the accumulated sum, init to 0       
double average=0;       // average in double       
int lowerbound = 1;   // the lower bound to sum       
int upperbound = 100; // the upper bound to sum   
     
for (int num = lowerbound; num <= upperbound; ++num){
   sum+=num; 
   average=(double)(sum)/num;// sum*1.
}
    System.out.println("The Sum is "+sum);
    System.out.println("The Average is"+average);
    
    }
    
}
