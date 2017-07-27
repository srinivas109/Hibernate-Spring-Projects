package com.vishu.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vishu.model.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO{

	public List<Student> getallstudents() {
List<Student> students = new ArrayList<Student>();
		
Student vo1 = new Student();
		vo1.setId(1);
		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		students.add(vo1);
		
		Student vo2 = new Student();
		vo2.setId(2);
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		students.add(vo2);
		
		return students;
	}

}
