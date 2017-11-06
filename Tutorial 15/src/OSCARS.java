
public class OSCARS extends Video {
 public String movies;
 public int length;
 public boolean avail=true;
 public String director;
 public String rating;
  public OSCARS(String m,int l,String d,String r){
	  super(m,l);
	  director=d;
	  rating=r;
	}
  public void display(){
	  super.show();
	  System.out.println("Director:"+director+"\n Rating: "+rating);
  }
  public static void main(String[] args){
	  OSCARS movie = new OSCARS("Grand Budapest",120," Ralph Fiennes","5 Stars");
	  movie.display();
  }
  
}
