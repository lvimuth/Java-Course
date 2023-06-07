//Day13_02
class Student{
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
		
		obj1.setRegNumber("A1111");
		obj1.setName("ABC");
		obj1.setAge(34);
		
		System.out.println(obj1.getRegNumber());
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		
		Student obj2 = new Student();
		
		obj2.setRegNumber("A222");
		obj2.setName("CBA");
		obj2.setAge(43);
		
		System.out.println(obj2.getRegNumber());
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
	}
} 