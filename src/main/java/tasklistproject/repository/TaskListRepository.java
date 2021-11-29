package tasklistproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tasklistproject.model.TaskList;

public interface TaskListRepository extends JpaRepository<TaskList, Long>{
	List<TaskList> findByUserName(String user);
}
