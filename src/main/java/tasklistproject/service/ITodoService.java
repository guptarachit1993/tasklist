package tasklistproject.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import tasklistproject.model.TaskList;

public interface ITodoService {

	List<TaskList> getTodosByUser(String user);

	Optional<TaskList> getTodoById(long id);

	void updateTodo(TaskList taskList);

	void addTodo(String name, String desc, Date targetDate);

	void deleteTodo(long id);
	
	void saveTodo(TaskList taskList);

}