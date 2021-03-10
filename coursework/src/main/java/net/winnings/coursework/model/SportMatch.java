package net.winnings.coursework.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Класс сущности SportMatch из базы данных
 * @author Nosolenko
 * @version 1.0
 */
@Entity
public class SportMatch {

    /** Поле id матча, являющееся первичным ключом с автоматической генерацией значений */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** Поле названия матча */
    @Column(nullable = false)
    private String name;
    /** Поле даты начала матча */
    @Column(nullable = false)
    private Date dateOfMatch;
    /** Поле коэффициента на первую команду */
    @Column(nullable = false)
    private float firstCoefficient;
    /** Поле коэффициента на вторую команду */
    @Column(nullable = false)
    private float secondCoefficient;
    /** Поле окончания матча */
    @Column(nullable = false)
    private boolean isEnd;

    /** Поле, в котором хранятся все ставки на данный матч*/
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Set<Bet> bets;
    /**
     * Конструктор - создание нового пользователя
     */
    public SportMatch() {
    }

    /**
     * Функция получения значения поля {@link SportMatch#id}
     * @return возвращает идентификатор матча
     */
    public Long getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора матча {@link SportMatch#id}
     * @param id - идентификатор матча
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link SportMatch#name}
     * @return возвращает название матча
     */
    public String getName() {
        return name;
    }

    /**
     * Процедура определения названия матча {@link SportMatch#name}
     * @param name - название матча
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля {@link SportMatch#dateOfMatch}
     * @return возвращает дату начала матча
     */
    public Date getDateOfMatch() {
        return dateOfMatch;
    }

    /**
     * Процедура определения даты начала матча {@link SportMatch#dateOfMatch}
     * @param dateOfMatch - дата начала матча
     */
    public void setDateOfMatch(Date dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    /**
     * Функция получения значения поля {@link SportMatch#firstCoefficient}
     * @return возвращает коэффициент первой команды
     */
    public float getFirstCoefficient() {
        return firstCoefficient;
    }

    /**
     * Процедура определения коэффициента первой команды {@link SportMatch#firstCoefficient}
     * @param firstCoefficient - коэффициент первой команды
     */
    public void setFirstCoefficient(float firstCoefficient) {
        this.firstCoefficient = firstCoefficient;
    }

    /**
     * Функция получения значения поля {@link SportMatch#secondCoefficient}
     * @return возвращает коэффициент второй команды
     */
    public float getSecondCoefficient() {
        return secondCoefficient;
    }

    /**
     * Процедура определения коэффициента второй команды {@link SportMatch#secondCoefficient}
     * @param secondCoefficient - коэффициент второй команды
     */
    public void setSecondCoefficient(float secondCoefficient) {
        this.secondCoefficient = secondCoefficient;
    }

    /**
     * Функция получения значения поля {@link SportMatch#isEnd}
     * @return возвращает индикатор окончания матча
     */
    public boolean isEnd() {
        return isEnd;
    }

    /**
     * Процедура определения коэффициента второй команды {@link SportMatch#isEnd}
     * @param end - индикатор окончания матча
     */
    public void setEnd(boolean end) {
        isEnd = end;
    }

    // TODO написать javadoc
    public Set<Bet> getBets() {
        return bets;
    }

    public void setBets(Set<Bet> bets) {
        this.bets = bets;
    }

    @Override
    public String toString() {
        return "SportMatch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfMatch=" + dateOfMatch +
                ", firstCoefficient=" + firstCoefficient +
                ", secondCoefficient=" + secondCoefficient +
                ", isEnd=" + isEnd +
                '}';
    }
}
