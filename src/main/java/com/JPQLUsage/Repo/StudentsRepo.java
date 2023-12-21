package com.JPQLUsage.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.JPQLUsage.Entity.StudentEntity;

public interface StudentsRepo extends JpaRepository<StudentEntity, Integer>{
	@Query(value = "select * from STUDENT_ENTITY ",nativeQuery = true)
	public List<StudentEntity> getAllUsersDatalist();
	
	
	@Query("select u from StudentEntity u")
	public List<StudentEntity> fetchAllUsers();
	
	
	@Query("select u from StudentEntity u where u.name=:a and u.branch=:b")
	public List<StudentEntity> fetchNameAndBranch(@Param("a") String name,@Param("b") String branch);

}
