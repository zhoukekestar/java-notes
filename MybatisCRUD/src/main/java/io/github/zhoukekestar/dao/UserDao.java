package io.github.zhoukekestar.dao;

import io.github.zhoukekestar.model.User;

public interface UserDao {
	public User get(int id);
	public int insert(User user);
	public int delete(int id);
	public int update(User user);
}
