package net.winnings.coursework.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Date;
import java.util.Set;

/**
 * Класс сущности User из базы данных
 * @author Nosolenko
 * @version 1.0
 */
@Entity
public class User {

    /** Поле id пользователя, являющееся первичным ключом с автоматической генерацией значений */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** Поле фамилии пользователя */
    @Column(nullable = false)
    private String surname;
    /** Поле имени пользователя */
    @Column(nullable = false)
    private String name;
    /** Поле даты рождения пользователя */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    /** Поле денежного счета пользователя */
    @Column(nullable = false)
    @Digits(integer = 10, fraction = 2)
    private double moneyScore;
    /** Поле пути к изображению пользователя */
    private String image;

    /** Поле, в котором хранятся авторизационные данные пользователя */
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    private UserLoginData loginData;
    /** Поле, в котором хранятся все ставки пользователя*/
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Set<Bet> bets;

    /**
     * Конструктор - создание нового пользователя
     */
    public User() {
    }

    /**
     * Функция получения значения поля {@link User#id}
     * @return возвращает идентификатор пользователя
     */
    public Long getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора пользователя {@link User#id}
     * @param id - идентификатор пользователя
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link User#surname}
     * @return возвращает фамилию пользователя
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Процедура определения фамилии пользователя {@link User#surname}
     * @param surname - фамилия пользователя
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Функция получения значения поля {@link User#name}
     * @return возвращает имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Процедура определения имени пользователя {@link User#name}
     * @param name - имя пользователя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля {@link User#dateOfBirth}
     * @return возвращяет дату рождения пользователя
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Процедура определения даты рождения пользователя {@link User#dateOfBirth}
     * @param dateOfBirth - дата рождения пользователя
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Функция получения значения поля {@link User#moneyScore}
     * @return возвращает денежный счет пользователя
     */
    public double getMoneyScore() {
        return moneyScore;
    }

    /**
     * Процедура определения денежного счета пользователя {@link User#moneyScore}
     * @param moneyScore - денежный счет пользователя
     */
    public void setMoneyScore(double moneyScore) {
        this.moneyScore = moneyScore;
    }

    /**
     * Функция получения значения поля {@link User#image}
     * @return возвращает фотографию пользователя
     */
    public String getImage() {
        return image;
    }

    /**
     * Процедура определения денежного счета пользователя {@link User#image}
     * @param image - фотография пользователя
     */
    public void setImage(String image) {
        this.image = image;
    }

    // TODO написать javadoc
    public UserLoginData getLoginData() {
        return loginData;
    }

    public void setLoginData(UserLoginData loginData) {
        this.loginData = loginData;
    }

    public Set<Bet> getBets() {
        return bets;
    }

    public void setBets(Set<Bet> bets) {
        this.bets = bets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", moneyScore=" + moneyScore +
                ", image='" + image + '\'' +
                '}';
    }
}
