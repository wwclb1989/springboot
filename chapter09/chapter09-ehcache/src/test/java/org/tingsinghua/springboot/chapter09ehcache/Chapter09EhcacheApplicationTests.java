package org.tingsinghua.springboot.chapter09ehcache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter09EhcacheApplicationTests {

	@Autowired
	BookDao bookDao;
	@Test
	public void contextLoads() {
		bookDao.getBookById(1);
		bookDao.getBookById(1);
		bookDao.deleteBookById(1);
		Book b3 = bookDao.getBookById(1);
		System.out.println("b3:" + b3);
		Book b = new Book();
		b.setName("三国演义");
		b.setAuthor("罗贯中");
		b.setId(1);
		bookDao.updateBookById(b);
		Book b4 = bookDao.getBookById(1);
		System.out.println(b4);
	}

}

