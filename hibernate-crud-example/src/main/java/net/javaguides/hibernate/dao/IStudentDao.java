package net.javaguides.hibernate.dao;

import net.javaguides.hibernate.model.Student;

public interface IStudentDao {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	java.util.List<Student> getAllStudents();

	void deleteStudent(long id);

}