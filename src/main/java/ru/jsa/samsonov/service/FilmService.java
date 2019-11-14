package ru.jsa.samsonov.service;

import org.springframework.stereotype.Service;
import ru.jsa.samsonov.entity.Film;

import java.util.List;

/**
 * @author Samsonov Konstantin
 *
 * <p>Film  service</p>
 */
@Service
public interface FilmService {
    /**
     * Get all Films
     *
     * @return film's list
     */
    List<Film> getAll();

    /**
     * Get Films
     *
     * @param film film entity
     * @return film's list
     */
    Film save(Film film);
}
