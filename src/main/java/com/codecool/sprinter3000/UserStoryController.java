package com.codecool.sprinter3000;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserStoryController {

    private final UserStoryService userStoryService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("stories", userStoryService.getAll());
        model.addAttribute("title", "Main page");
        return "index";
    }

    @GetMapping("/add_user_story")
    public String displayAddNewStory(Model model) {
        model.addAttribute("title", "Add user story");
        model.addAttribute("userStory", new UserStory());
        return "add_story";
    }

    @PostMapping("/add_user_story")
    public String addNewStory(@ModelAttribute UserStory userStory) {
        userStoryService.addUserStory(userStory);
        return "redirect:/";
    }
}
