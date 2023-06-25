package Constructor_PrimitiveDI;

public class Student1_TypeAttribute {
	private int rollNo;
	private String name;
	private double marks;
	public Student1_TypeAttribute(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public void DisplaySt()
	{
		System.out.println(rollNo+name+marks);
	}

}
