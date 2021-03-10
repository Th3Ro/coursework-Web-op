package net.winnings.coursework.repository;

import net.winnings.coursework.model.UserLoginData;
import org.springframework.data.repository.CrudRepository;

/**
 * Интерфейс для взаимодействия с таблицей UserLoginData базы данных
 * @author Nosolenko
 * @version 1.0
 */
public interface UserLoginDataRepository extends CrudRepository<UserLoginData, Long> {
    /**
     * Функция получения авторизационных данных пользователя типа {@link UserLoginData}
     * @param userLogin - логин пользователя
     * @return возвращает авторизационные данные пользователя
     */
    UserLoginData findByUserLogin(String userLogin);
}
