package com.codecool.sprinter3000;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class UserStoryController {
    private final UserStoryService userStoryService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user_stories", userStoryService.getAllStories());
        model.addAttribute("title", "Super Sprinter 3000");
        return "index";
    }
}
