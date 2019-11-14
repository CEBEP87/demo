package ru.jsa.samsonov.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Samsonov Konstantin
 *
 * <p>Film's entity</p>
 */
@Entity
@Table(name = "FILMS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Film {

    /**
     * film's Identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   @Column(name = "ID")
    private Long id;

    /**
     * film's name
     */
    @Column(name = "NAME")
    private String name;

    /**
     * film's author
     */
    @Column(name = "AUTHOR")
    private String author;

    /**
     * film's genre
     */
    @Column(name = "GENRE")
    private String genre;

}
