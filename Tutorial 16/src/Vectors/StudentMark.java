package Vectors;

public class StudentMark {
private String name;
private String studentID;
private double exammarks;
private double cwMarks;
public StudentMark (String name, String studentID,double examMarks, double cwMarks){
	this.name= name;
	this.studentID=studentID;
	this.exammarks=examMarks;
	this.cwMarks=cwMarks;
	
}
public char getGrade(){
	char grade = 'F';
	return grade;
	
}
public double getTotalScore(){
	return (exammarks*0.6+cwMarks*0.4);
	
}
public void display(){
	System.out.println("Name:"+name+"Student ID"+studentID+"Marks:"+getTotalScore()+"Grade"+getGrade());
}
}
