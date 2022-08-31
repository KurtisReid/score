package dev.reid.score;

import dev.reid.entities.Score;
import dev.reid.repos.ScoreRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional // no crud operations will persist
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;

    @Test

    void add_score()
    {
        Score score = new Score(0, 1000, "aaa");
        Score savedScore = this.scoreRepo.save(score);
        Assertions.assertNotEquals(0, savedScore.getId());
    }

    @Test
    void all_scores()
    {
        Score score = new Score(0, 1000, "aaa");
        Score savedScore = this.scoreRepo.save(score);

        Score score2 = new Score(0, 1000, "aaa");
        Score savedScore2 = this.scoreRepo.save(score2);

        Score score3 = new Score(0, 1000, "aaa");
        Score savedScore3 = this.scoreRepo.save(score3);

        List<Score> scores = this.scoreRepo.findAll();

        Assertions.assertEquals(4, scores.size());
    }
}
