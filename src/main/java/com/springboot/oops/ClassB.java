package com.springboot.oops;


public class ClassB {
    private int classId;
    private String standard;
    private String school;

    public ClassB(){
        super();
    }

    public ClassB(int classId,String standard,String school){
        this.classId = classId;
        this.standard = standard;
        this.school = school;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "classId=" + classId +
                ", standard='" + standard + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
