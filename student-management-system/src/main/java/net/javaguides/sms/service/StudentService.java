package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
