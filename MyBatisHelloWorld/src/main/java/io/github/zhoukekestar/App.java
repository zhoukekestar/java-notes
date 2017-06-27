package io.github.zhoukekestar;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import io.github.zhoukekestar.beans.User;

/**
 * Hello world!
 *
 */
public class App {
	public static SqlSessionFactory sqlSessionFactory;

	public static void main(String[] args) throws IOException {
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		User name = session.selectOne("mapper.user.getNameByID", 2);

		System.out.println("Hello " + name.getName() + "!");
	}
}
