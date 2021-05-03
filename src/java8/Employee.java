package java8;

public class Employee {
private String name;
private Integer Age;
private Integer marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return Age;
}
public void setAge(Integer age) {
	Age = age;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public Employee(String name, Integer age, Integer i) {
	super();
	this.name = name;
	Age = age;
	this.marks = i;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Age == null) ? 0 : Age.hashCode());
	result = prime * result + ((marks == null) ? 0 : marks.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	
	if(other.getName().equals(this.getName())) 
		return true;
	return false;
	
}
@Override
public String toString() {
	return "EmployeeDetails [name=" + name + ", Age=" + Age + ", marks=" + marks + "]";
}

}
