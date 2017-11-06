
public class Video {
 public String title;
 public int length;
 public boolean avail;
  public Video(String t, int l){
	  title=t;
	  length=l;
  }
  public void show(){
	  System.out.println("Title: "+title+" \n Duration: "+length+"mins \n Availability:"+avail);
  }
}
