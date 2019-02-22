package com.orangehaswing.redis;

import com.orangehaswing.redis.bean.Student;
import com.orangehaswing.redis.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	private StudentService studentService;

	@Test
	public void test() throws Exception {
		Student student1 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getName());

		Student student2 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getName());
	}

	@Test
	public void test2() throws Exception{
		Student student1 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getName());

		student1.setName("康康");
		this.studentService.update(student1);

		Student student2 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getName());
	}


}

