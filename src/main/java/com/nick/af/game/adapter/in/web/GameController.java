package com.nick.af.game.adapter.in.web;

import com.nick.af.game.domain.Feature;
import com.nick.af.game.domain.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Controller
public class GameController {

    private final Game game;

    public GameController(Game game) {
        this.game = game;
    }

    @GetMapping("/")
    public String viewScore(Model model) {
        model.addAttribute("score", game.score());
        model.addAttribute("round", 0);
        List<FeatureView> featureViewList = game.availableFeatures().stream()
                .sorted(comparing(Feature::dollarValue))
                .map(FeatureView::from)
                .collect(Collectors.toList());
        model.addAttribute("availableFeatures", featureViewList);
        return "game-board";
    }
}
