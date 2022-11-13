package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	/*	Student student1 = new Student("leo", "sujeira", "polvinhomaravilha77@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("lucas", "ramires", "lucasrms@outlook.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("luciane", "carvalho", "lucicarvalho@gmail.com");
		studentRepository.save(student3);*/
	}

}
