package ru.jsa.samsonov.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.jsa.samsonov.entity.Film;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FilmControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getFilms() throws Exception {
        mockMvc.perform(get("/api/films"))
                .andExpect(status().isOk());
    }

    @Test
    public void postFilms() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders
                .post("/api/films")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(new Film(null, "asd", "asdf", "ACTION"))))
                .andExpect(status().isOk());

    }
}