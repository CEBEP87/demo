package ru.jsa.samsonov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.jsa.samsonov.entity.Film;
import ru.jsa.samsonov.repository.FilmRepository;
import ru.jsa.samsonov.service.FilmService;

import java.util.List;

/**
 * @author Samsonov Konstantin
 *
 * <p>Film service implement</p>
 */
@Service
public class FilmServiceImplement implements FilmService {

    /**
     * film repository
     */
    @Autowired
    FilmRepository filmRepository;

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film save(Film film) {
        return filmRepository.save(film);
    }
}
