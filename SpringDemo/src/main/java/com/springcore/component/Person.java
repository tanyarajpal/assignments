package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
		
		@Value("101")
		private int id;
		
		@Value("Tanya")
		private String name;
		
		@Value("Intern")
		private String designation;
		
		@Value("#{contactList}")
		private List<String>contacts;
		
		@Value("#{projectList}")
		private List<String>projects;

		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Person(int id, String name, String designation, List<String> contacts, List<String> projects) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.contacts = contacts;
			this.projects = projects;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public List<String> getContacts() {
			return contacts;
		}

		public void setContacts(List<String> contacts) {
			this.contacts = contacts;
		}

		public List<String> getProjects() {
			return projects;
		}

		public void setProjects(List<String> projects) {
			this.projects = projects;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", designation=" + designation + ", contacts=" + contacts
					+ ", projects=" + projects + "]";
		}
}
