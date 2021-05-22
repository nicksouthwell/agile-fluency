package com.nick.af.project.adapter.in.web;

import com.nick.af.project.domain.Feature;
import com.nick.af.project.domain.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Controller
public class GameController {

    private final Project project;

    public GameController(Project project) {
        this.project = project;
    }

    @GetMapping("/")
    public String viewScore(Model model) {
        model.addAttribute("score", project.score());
        model.addAttribute("round", 0);
        List<FeatureView> featureViewList = project.availableFeatures().stream()
                .sorted(comparing(Feature::dollarValue))
                .map(FeatureView::from)
                .collect(Collectors.toList());
        model.addAttribute("availableFeatures", featureViewList);
        return "game-board";
    }
}
