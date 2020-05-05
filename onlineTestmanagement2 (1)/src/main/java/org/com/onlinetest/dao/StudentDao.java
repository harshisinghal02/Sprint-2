package org.com.onlinetest.dao;

import java.math.BigInteger;
import java.util.Optional;

import org.com.onlinetest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDao extends JpaRepository<Student, BigInteger> {

	@Query(value="select student_id from student where student_name=:name and student_password=:password",nativeQuery = true)
	public Optional<BigInteger> checkLogin(String name,String password);
}
