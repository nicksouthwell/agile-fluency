package com.nick.af.adapter.web;

import com.nick.af.domain.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    private final Game game;

    public GameController(Game game) {
        this.game = game;
    }

    @GetMapping("/")
    public String viewScore(Model model) {
        model.addAttribute("score", game.score());
        return "game-board";
    }
}
