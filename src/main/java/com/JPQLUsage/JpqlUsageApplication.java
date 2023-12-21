package com.JPQLUsage;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JPQLUsage.Entity.StudentEntity;
import com.JPQLUsage.Repo.StudentsRepo;

@SpringBootApplication
public class JpqlUsageApplication {

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(JpqlUsageApplication.class, args);
StudentsRepo UserRepo=context.getBean(StudentsRepo.class);

List<StudentEntity> data=UserRepo.getAllUsersDatalist();
data.forEach(e->{System.out.println("native Users Data"+e);});

System.out.println("..............................................");


List<StudentEntity> fetch=UserRepo.fetchAllUsers();
fetch.forEach(e->{System.out.println("jpql users data : "+e);});
System.out.println("............");

List<StudentEntity> fetchUsingNameBranch=UserRepo.fetchNameAndBranch("DURYO", "SDPT");
fetchUsingNameBranch.forEach(e->{System.out.println("fetchUsingNameBranch"+e);});
	}

}
