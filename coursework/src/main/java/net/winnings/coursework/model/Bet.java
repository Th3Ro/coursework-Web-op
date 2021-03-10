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
    /** Поле идентификатора матча */
    private Long matchId;
    /** Поле идентификатора пользователя */
    private Long userId;
    /** Поле номера команды */
    private byte teamNumber;
    /** Поле суммы ставки */
    private int money;
    /** Поле результата ставки */
    private byte winResult;

    /**
     * Конструктор - создание нового пользователя
     */
    public Bet() {
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param matchId - идентификатор матча
     * @param userId - идентификатор пользователя
     * @param teamNumber - номер команды
     * @param money - сумма ставки
     */
    public Bet(Long matchId, Long userId, byte teamNumber, int money) {
        this.matchId = matchId;
        this.userId = userId;
        this.teamNumber = teamNumber;
        this.money = money;
        this.winResult = 0;
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
     * Функция получения значения поля {@link Bet#matchId}
     * @return возвращает идентификатор матча
     */
    public Long getMatchId() {
        return matchId;
    }

    /**
     * Процедура определения идентификатора матча {@link Bet#matchId}
     * @param matchId - идентификатор матча
     */
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    /**
     * Функция получения значения поля {@link Bet#userId}
     * @return возвращает идентификатор пользователя
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Процедура определения идентификатора пользователя {@link Bet#userId}
     * @param userId - идентификатор пользователя
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}
