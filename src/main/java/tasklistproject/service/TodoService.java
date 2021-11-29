package tasklistproject.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import tasklistproject.model.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tasklistproject.repository.TaskListRepository;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TaskListRepository taskListRepository;

	@Override
	public List<TaskList> getTodosByUser(String user) {
		return taskListRepository.findByUserName(user);
	}

	@Override
	public Optional<TaskList> getTodoById(long id) {
		return taskListRepository.findById(id);
	}

	@Override
	public void updateTodo(TaskList taskList) {
		taskListRepository.save(taskList);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate) {
		taskListRepository.save(new TaskList(name, desc, targetDate));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<TaskList> todo = taskListRepository.findById(id);
		if (todo.isPresent()) {
			taskListRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(TaskList taskList) {
		taskListRepository.save(taskList);
	}
}