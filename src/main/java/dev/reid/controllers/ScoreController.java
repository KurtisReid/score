package dev.reid.controllers;

import dev.reid.entities.Score;
import dev.reid.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public interface ScoreController {


    @GetMapping("/scores")
    @ResponseBody
    public List<Score> getAllScores();

}
