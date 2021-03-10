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

    /** Поле, в котором хранится сущность пользователя */
    @OneToOne(optional = true, cascade = CascadeType.PERSIST)
    private User user;

    /**
     * Конструктор - создание нового пользователя
     */
    public UserLoginData() {
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

    // TODO написать javadoc
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLoginData{" +
                "id=" + id +
                ", userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
