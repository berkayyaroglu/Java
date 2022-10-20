package net.javaguides.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import antlr.collections.List;
import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentDao {
	
	//saveStudent
	//getAllStudents
	//getStudentById
	//updateStudent
	//deleteStudent
	
	@Override
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();	
			}
		}
	}
	
	@Override
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//save student object
			session.saveOrUpdate(student);
			
			//commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();	
			}
		}
	}
	
	@Override
	public Student getStudentById(long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//get student object
			student = session.get(Student.class, id);
			
			//commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();	
			}
		}
		return student;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<Student> getAllStudents() {
		Transaction transaction = null;
		java.util.List<Student> students = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//get student object
			students = session.createQuery("from Student").list();
			
			//commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();	
			}
		}
		return students;
	}
	
	@Override
	public void deleteStudent(long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			student = session.get(Student.class, id);
			//get student object
			session.delete(student);
			
			//commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();	
			}
		}
	}
}
