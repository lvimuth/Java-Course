//Day13_02
public class Student{
	private String regNumber;
	private String name;
	private int age;
	
	
	public void setRegNumber(String tRegNumber){
		regNumber = tRegNumber;
	}
	public String getRegNumber(){
		return regNumber;
	}
	public void setName(String tName){
		name = tName;
	}
	public String getName(){
		return name;
	}
	public void setAge(int tAge){
		age = tAge;
	}
	public int getAge(){
		return age;
	}
	
}

public class DP{
	public static void main(String args[]){
		Student obj1 = new Student();
		obj1.setName("Lakshitha");
		String name = obj1.getName();
		System.out.print(name);
	}
} 