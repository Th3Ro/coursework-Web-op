package net.winnings.coursework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Главный класс, запускающий приложение
 * @author Nosolenko
 * @version 1.0
 */
@SpringBootApplication
public class CourseworkApplication {
	/**
	 * Главная процедура, запускаемая при старте программы
	 * @param args - обязательный параметр
	 */
	public static void main(String[] args) {
		SpringApplication.run(CourseworkApplication.class, args);
	}

}
