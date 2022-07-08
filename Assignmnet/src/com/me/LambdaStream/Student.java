package com.me.LambdaStream;

public class Student {
int studentId;
String name;
float percent;
String branch;
public Student(int studentId, String name, float percent, String branch) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.percent = percent;
	this.branch = branch;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPercent() {
	return percent;
}
public void setPercent(float percent) {
	this.percent = percent;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", percent=" + percent + ", branch=" + branch + "]";
}


}
