/**
 * Program Name: Student Information Using Inheritance
 *
 * Description:
 * This program demonstrates the concept of inheritance in Java.
 * A parent class `College` stores common college details such as
 * college name and address using static variables.
 *
 * The child class `Student` inherits these properties and adds
 * student-specific information like enrollment number, name,
 * and stream.
 * 
 * Author: Hamida Badamdi
 */
package pkg;

class College
{
	static String clgName = "Marwadi University";
	static String address = "Rajkot - Morbi HighWay";
				
}
class Student extends College
{
	int stud_enrollNo;
	String name;
	String stream;
	

	public Student(int stud_enrollNo, String name,	String stream) 
	{
		this.stud_enrollNo = stud_enrollNo;
		this.name = name;
		this.stream = stream;
			
	}
		
	public void showInfo()
	{
		System.out.println("College Name : " + clgName);
		System.out.println("College Address : " + address);
		System.out.println("Student Enrollment No. : " + stud_enrollNo);
		System.out.println("Student Name : " + name);
		System.out.println("Stream : " + stream);
		
	}

	
	
}
public class StudentInfo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1234 ,"Ruhi Shah" , "M.C.A");
		s1.showInfo();
				
		
	}

}
