package com.nick.af.project.adapter.in.web;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.in.NewProjectUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    private final NewProjectResponse newProjectResponse;

    public GameController(NewProjectUseCase projectCreator) {
        this.newProjectResponse = projectCreator.newProject();
    }

    @GetMapping("/")
    public String viewScore(Model model) {
        model.addAttribute("score", 0);
        model.addAttribute("round", 0);
//        List<FeatureView> featureViewList = project.availableFeatures().stream()
//                .sorted(comparing(Feature::dollarValue))
//                .map(FeatureView::from)
//                .collect(Collectors.toList());
//        model.addAttribute("availableFeatures", featureViewList);
        return "game-board";
    }
}
