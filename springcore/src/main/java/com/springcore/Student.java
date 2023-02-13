package com.springcore;
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    public Student(int studentid, String studentName, String studentAddress) {
//        super();
        this.studentId = studentid;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public int getStudentid() {
        return studentId;
    }
    public void setStudentid(int studentid) {
        this.studentId = studentid;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    @Override
    public String toString() {
        return "Student [studentid=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }
    
    
}