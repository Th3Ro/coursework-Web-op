package net.winnings.coursework.model;

import javax.persistence.*;

/**
 * Класс сущности Bet из базы данных
 * @author Nosolenko
 * @version 1.0
 */
@Entity
public class Bet {

    /** Поле id пользователя, являющееся первичным ключом с автоматической генерацией значений */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** Поле номера команды */
    private byte teamNumber;
    /** Поле суммы ставки */
    private int money;
    /** Поле результата ставки */
    private byte winResult;

    /** Поле, в котором хранится пользователь, сделавший ставку */
    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
    /** Поле, в котором хранится матч, на который сделали ставку */
    @ManyToOne(cascade = CascadeType.PERSIST)
    private SportMatch sportMatch;

    /**
     * Конструктор - создание нового пользователя
     */
    public Bet() {
    }

    /**
     * Функция получения значения поля {@link Bet#id}
     * @return возвращает идентификатор ставки
     */
    public Long getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора ставки {@link Bet#id}
     * @param id - идентификатор ставки
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link Bet#teamNumber}
     * @return возвращает номер команды
     */
    public byte getTeamNumber() {
        return teamNumber;
    }

    /**
     * Процедура определения номера команды {@link Bet#teamNumber}
     * @param teamNumber - номер команды
     */
    public void setTeamNumber(byte teamNumber) {
        this.teamNumber = teamNumber;
    }

    /**
     * Функция получения значения поля {@link Bet#winResult}
     * @return возвращает результат ставки
     */
    public byte getWinResult() {
        return winResult;
    }
    /**
     * Процедура определения результата ставки {@link Bet#winResult}
     * @param winResult - результат ставки
     */
    public void setWinResult(byte winResult) {
        this.winResult = winResult;
    }

    /**
     * Функция получения значения поля {@link Bet#money}
     * @return возвращает сумму ставки
     */
    public int getMoney() {
        return money;
    }

    /**
     * Процедура определения суммы ставки {@link Bet#money}
     * @param money - сумма ставки
     */
    public void setMoney(int money) {
        this.money = money;
    }

    // TODO написать javadoc
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SportMatch getSportMatch() {
        return sportMatch;
    }

    public void setSportMatch(SportMatch sportMatch) {
        this.sportMatch = sportMatch;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id +
                ", teamNumber=" + teamNumber +
                ", money=" + money +
                ", winResult=" + winResult +
                '}';
    }
}
