package cn.edu.xcu.demo;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cn.edu.xcu.demo.entity.Book;
import cn.edu.xcu.demo.service.impl.BookServiceImpl;

@SpringBootApplication
@MapperScan("cn.edu.xcu.demo.mapper")
public class Springboot03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Springboot03Application.class, args);
		BookServiceImpl bookServiceImpl=context.getBean(BookServiceImpl.class);
		List<Book> list=bookServiceImpl.list();
//		for (Book book : list) {
//			System.out.println(book);
//		}
		IPage<Book> toWichPage=new Page<Book>(1,2);
		QueryWrapper<Book> wrapper=new QueryWrapper<>();
		wrapper.between("id", 10, 25);
		
		wrapper.like("name", "J");
		IPage<Book> resultPage=bookServiceImpl.page(toWichPage,wrapper);
		System.out.println(resultPage.getPages());
		System.out.println(resultPage.getRecords());
	}

}
