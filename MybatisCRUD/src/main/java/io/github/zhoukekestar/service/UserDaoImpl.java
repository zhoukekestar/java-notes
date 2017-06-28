package io.github.zhoukekestar.service;

import io.github.zhoukekestar.dao.UserDao;
import io.github.zhoukekestar.model.User;
import io.github.zhoukekestar.util.DB;

public class UserDaoImpl implements UserDao {

	public User get(int id) {
		return DB.session.selectOne("mapper.user.getUser", id);
		
	}

	public int insert(User user) {
		int result = DB.session.insert("mapper.user.insertUser", user);
		DB.session.commit();
		return result;
	}

	public int delete(int id) {
		int result = DB.session.delete("mapper.user.deleteUser", id);
		DB.session.commit();
		return result;
	}

	public int update(User user) {
		int result = DB.session.update("mapper.user.updateUser", user);
		DB.session.commit();
		return result;
	}


}
