package net.winnings.coursework.model;

import javax.persistence.*;

/**
 * Класс сущности UserLoginData из базы данных
 * @author Nosolenko
 * @version 1.0
 */
@Entity
public class UserLoginData {

    /** Поле id пользовательских данных для входа,
     * являющееся первичным ключом с автоматической генерацией значений */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** Поле логина пользователя */
    @Column(nullable = false, unique = true)
    private String userLogin;
    /** Поле пароля пользователя */
    @Column(nullable = false)
    private String userPassword;
    /** Поле идентификатора пользователя, которому принадлежат эти данные */
    @Column(nullable = false)
    private Long userId;

    /**
     * Конструктор - создание нового пользователя
     */
    public UserLoginData() {
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param userLogin - логин
     * @param userPassword - пароль
     * @param userId - идентификатор пользователя, которому принадлежат эти данные
     */
    public UserLoginData(String userLogin, String userPassword, Long userId) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userId = userId;
    }

    /**
     * Функция получения значения поля {@link UserLoginData#id}
     * @return возвращает идентификатор данных для входа
     */
    public Long getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора данных для входа {@link UserLoginData#id}
     * @param id - идентификатор данных для входа
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link UserLoginData#userLogin}
     * @return возвращает логин
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Процедура определения логина {@link UserLoginData#userLogin}
     * @param userLogin - логин
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    /**
     * Функция получения значения поля {@link UserLoginData#userPassword}
     * @return возвращает пароль
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Процедура определения пароля {@link UserLoginData#userLogin}
     * @param userPassword - пароль
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Функция получения значения поля {@link UserLoginData#userId}
     * @return возвращает идентификатор пользователя, которому принадлежат эти данные
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Процедура определения идентификатора пользователя, которому принадлежат эти данные {@link UserLoginData#userId}
     * @param userId - идентификатор пользователя, которому принадлежат эти данные
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
