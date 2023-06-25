package Constructor_PrimitiveDI;

public class Student {
	private int rollNo;
	private String name;
	private String name1;
	private double marks;
	public Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
public void displayStudDetails()
{
	System.out.println(rollNo+name+marks);
}
}
