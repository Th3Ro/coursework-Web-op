package net.winnings.coursework.repository;

import net.winnings.coursework.model.Bet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Интерфейс для взаимодействия с таблицей Bet базы данных
 * @author Nosolenko
 * @version 1.0
 */
public interface BetRepository extends CrudRepository<Bet, Long> {
    /**
     * Функция получения ставки типа {@link Bet}
     * @param userId - идентификатор пользователя
     * @param matchId - идентификатор матча
     * @return возвращает ставку
     */
    Bet findByUserIdAndAndMatchId(Long userId, Long matchId);

    /**
     * Функция получения списка ставок типа {@link Bet}
     * @param userId - идентификатор пользователя
     * @return возвращает список ставок
     */
    List<Bet> findAllByUserId(Long userId);

    /**
     * Функция получения списка ставок типа {@link Bet}
     * @param matchId - идентификатор матча
     * @return возвращает список ставок
     */
    List<Bet> findAllByMatchId(Long matchId);
}
