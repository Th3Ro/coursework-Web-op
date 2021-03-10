package net.winnings.coursework.repository;

import net.winnings.coursework.model.SportMatch;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Интерфейс для взаимодействия с таблицей SportMatch базы данных
 * @author Nosolenko
 * @version 1.0
 */
public interface SportMatchRepository extends CrudRepository<SportMatch, Long> {
    /**
     * Функция получения списка матчей типа {@link SportMatch}
     * @return возвращает список матчей типа
     */
    List<SportMatch> findAll();
}
