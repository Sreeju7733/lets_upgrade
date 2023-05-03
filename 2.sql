CREATE DATABASE todo_list;
CREATE TABLE todo_list(
	task_id INT AUTO_INCREMENT,
	task_name VARCHAR(255),
	description TEXT,
	is_completed BOOLEAN
	PRIMARY KEY(order_id)
);
