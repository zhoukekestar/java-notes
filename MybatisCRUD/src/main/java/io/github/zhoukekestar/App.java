package io.github.zhoukekestar;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import io.github.zhoukekestar.model.User;
import io.github.zhoukekestar.service.UserDaoImpl;
import io.github.zhoukekestar.util.DB;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {
		DB.init();
		
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		
		User user = null;
		
//		for (int i = 100; i < 110; i++) {
//			user = new User("李四-" + String.valueOf(i));
//			user.setId(i);
//			System.out.println("insert " + userDaoImpl.insert(user));
//		}		
//		
//		user = userDaoImpl.get(101);
//		System.out.println("select " + user.getName());
//		
//		user.setName("李四 - update");
//		System.out.println("update " + userDaoImpl.update(user));
//		
		
		for (int i = 100; i < 110; i++) {
			System.out.println("delete " + userDaoImpl.delete(i));
		}
	}
	
	
}
