package net.javaguides.hibernate;

import antlr.collections.List;
import net.javaguides.hibernate.dao.IStudentDao;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {
	
	public static void main(String[] args) {
		
		IStudentDao studentDao = new StudentDao();
		
		//test saveStudent
		Student student = new Student("Berkay", "Yaroglu", "berkayyaroglu1@gmail.com");
		studentDao.saveStudent(student);
		
		//updateStudent
		student.setFirstName("Beko");
		studentDao.updateStudent(student);
		
		//test getStudentById
		Student student2 = studentDao.getStudentById(student.getId());
		
		//test getAllStudents
		java.util.List<Student> students = studentDao.getAllStudents();
		students.forEach(student1 -> System.out.println(student1.getId()));
		
		//test deleteStudent
		studentDao.deleteStudent(student.getId());
	}
}
