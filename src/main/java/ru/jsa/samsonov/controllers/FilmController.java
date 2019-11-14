package ru.jsa.samsonov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jsa.samsonov.entity.Film;
import ru.jsa.samsonov.service.FilmService;

import java.util.List;


/**
 * @author Samsonov Konstantin
 *
 * <p>Film's controller</p>
 */
@RequestMapping("/api/films")
@RestController

public class FilmController {

    /**
     * film service
     */
    @Autowired
    FilmService filmService;

    /**
     * Get Films
     *
     * @return film's list
     */
    @GetMapping
    public List<Film> getFilms() {
        return filmService.getAll();
    }

    /**
     * Post Film
     *
     * @param film film entity
     * @return posted film
     */
    @PostMapping
    public Film postFilms(@RequestBody Film film) {
        return filmService.save(film);
    }

}
