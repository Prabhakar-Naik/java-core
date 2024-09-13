package com.springboot.collections.list.dynamicexample;

/**
 * @author prabhakar, @Date 13-09-2024
 */
public class Student {

    private int sid;
    private String studentName;
    private String location;
    private String course;
    private double fee;
    private String department;

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public Student() {
        super();

    }


    public Student(int sid, String studentName, String location, String course,double fee,String department) {
        super();
        this.sid = sid;
        this.studentName = studentName;
        this.location = location;
        this.course = course;
        this.fee = fee;
        this.department=department;
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", studentName=" + studentName + ", location=" + location + ", course=" + course + ", fee="
                + fee +", Department="+department+ "]";
    }
}
