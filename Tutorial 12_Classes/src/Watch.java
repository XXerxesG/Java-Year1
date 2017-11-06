
public class Watch {
public String name;
public double price;
public String color;
  public Watch(String name, double price,String color)
	{
	  this.name=name;
	  this.price=price;
	  this.color=color;
	}
  public static void main(String[] args) {
	  Watch casio= new Watch("Casio",59.90,"Black");
	  Watch timex=new Watch("Timex",100,"Gold");
	  Watch adidas= new Watch("Adidas",90,"Blue");
	  Watch[] watchArr= new Watch[3];
	  watchArr[0]= casio;
	  watchArr[1]=adidas;
	  watchArr[2]=timex;
	  exp(watchArr);
	}
  public static void exp(Watch arr[])
  {
	  double  ex=arr[0].price;
	  int p=0;
	  for(int i=0;i<arr.length;i++){
		  if(ex<arr[i].price){
			  ex=arr[i].price;
			 p=i; 
		  }
	  }
	  System.out.print("The most expensive watch is "+(arr[p].name));
  }
}
