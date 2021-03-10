package net.winnings.coursework.repository;

import net.winnings.coursework.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерфейс для взаимодействия с таблицей User базы данных
 * @author Nosolenko
 * @version 1.0
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
