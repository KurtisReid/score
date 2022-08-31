package dev.reid.services;

import dev.reid.entities.Score;
import dev.reid.repos.ScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    ScoreRepo scoreRepo;

    @Override
    public List<Score> getAllScores() {
        return this.scoreRepo.findAll();

    }
}
