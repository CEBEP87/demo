package ru.jsa.samsonov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.jsa.samsonov.entity.Film;

/**
 * @author Samsonov Konstantin
 *
 * <p>Film repository</p>
 */
@Repository
public interface FilmRepository  extends JpaRepository<Film, Long> {
}
