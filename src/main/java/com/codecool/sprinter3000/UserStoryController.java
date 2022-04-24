package com.codecool.sprinter3000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserStoryController {
    private final UserStoryService userStoryService;

    @Autowired
    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user_stories", userStoryService.getAllStories());
        model.addAttribute("title", "Super Sprinter 3000");
        return "index";
    }
}
