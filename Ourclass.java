package step03.my.application;

public class Ourclass {
	String name;
	String sex;
	int age;
	String city;
	
	Ourclass(String n, String s, int a, String c){
		name = n;
		sex = s;
		setAge(a);
		city = c;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("ÀçÀÔ·Â");
		}
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return name + " " + sex + " " + age + " " +city;
	}
}
