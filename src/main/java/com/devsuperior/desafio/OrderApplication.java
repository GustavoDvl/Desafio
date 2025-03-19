package com.devsuperior.desafio;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(OrderApplication.class);

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Exemplo 1
		Order order1 = new Order(1034L, 150.00, 20.0);
		double total1 = orderService.calculateTotal(order1);
		logger.info("Pedido código {}\nValor total: R$ {}", order1.getCode(), String.format("%.2f", total1));

		// Exemplo 2
		Order order2 = new Order(2282L, 800.00, 10.0);
		double total2 = orderService.calculateTotal(order2);
		logger.info("Pedido código {}\nValor total: R$ {}", order2.getCode(), String.format("%.2f", total2));

		// Exemplo 3
		Order order3 = new Order(1309L, 95.90, 0.0);
		double total3 = orderService.calculateTotal(order3);
		logger.info("Pedido código {}\nValor total: R$ {}", order3.getCode(), String.format("%.2f", total3));
	}
}