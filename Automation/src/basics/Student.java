package basics;

public class Student {
private int sid;
private String name;
private int age;
Student(){}
public Student(int sid, String name, int age) {
	super();
	this.sid = sid;
	this.name = name;
	this.age = age;
}
public int getSid() {
	return sid;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setSid(int sid) {
	this.sid=sid;
}
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}




}
