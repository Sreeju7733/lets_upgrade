CREATE DATABASE Sales;
CREATE TABLE orders(
	order_id INT AUTO_INCREMENT,
	customer_id INT,
	order_date DATE,
	order_total FLOAT
	PRIMARY KEY(order_id)
	FOREIGN KEY(customer_id) REFERENCES customer
);
