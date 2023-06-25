package dependencyInjection_PrimitiveDI;

public class Car {
	
private int rollnumber;
private String name;
private double marks;


public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public void display()
{
	System.out.println(rollnumber+name+marks);
}

}
