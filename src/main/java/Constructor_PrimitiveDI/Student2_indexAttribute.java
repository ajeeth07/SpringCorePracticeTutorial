package Constructor_PrimitiveDI;

public class Student2_indexAttribute {
	private int rollNo;
	private String name;
	private double marks;
	public Student2_indexAttribute(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public void DisplaySt2()
	{
		System.out.println(rollNo+name+marks);
	}


}
