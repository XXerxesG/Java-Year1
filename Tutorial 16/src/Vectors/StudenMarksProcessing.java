package Vectors;
import java.util.*;
import java.io.*;
public class StudenMarksProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudenMarksProcessing app = new StudenMarksProcessing();
		try{
			app.run();
			
		}catch(FileNotFoundException e){
			System.out.println("Data File not found");
		}
	}
public void run() throws FileNotFoundException{
	//read file
	Scanner sc = new Scanner(new File("marks.txt"));
	Vector<StudentMark> marks = new Vector<StudentMark>();
	while(sc.hasNextLine()){
		String line= sc.nextLine();
		String[] data= line.split("\\|");
		String name = data[0];
		String studentID =data[1];
		double examMarks= Double.parseDouble(data[2]);
		double cwMarks = Double.parseDouble(data[3]);
		
		StudentMark sm = new StudentMark(name,studentID,examMarks,cwMarks);
		marks.add(sm);
	}
	//print all students
	for(int i=0;i<marks.size();i++){
		StudentMark sm= marks.get(i);
		sm.display();
	}
	//Ace Students
	
	for(int i=0;i<marks.size();i++){
		StudentMark sm = marks.get(i);
		char grade=sm.getGrade();
		if(grade=='A'){
			sm.display();
		}
	}
	// Average marks
	double total =0;
	for(int i=0;i<marks.size();i++){
		StudentMark sm=marks.get(i);
		total+=sm.getTotalScore();
	}
	double average =total/marks.size();
	System.out.printf("Average:%.2f",average);
	}
  }

