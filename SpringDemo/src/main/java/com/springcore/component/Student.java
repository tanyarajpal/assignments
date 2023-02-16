package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
		@Value("Tanya")
		private String studentName;
		@Value("Delhi")
		private String city;
		
		@Value("#{alist}")
		private List<String>addresses;
		
		
		@Override
		public String toString() {
			return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
		}
		public Student(String studentName, String city, List<String> addresses) {
			super();
			this.studentName = studentName;
			this.city = city;
			this.addresses = addresses;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public List<String> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<String> addresses) {
			this.addresses = addresses;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
