package com.codecool.sprinter3000;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserStoryRepository {
    private static List<UserStory> stories = new ArrayList<>();

    @PostConstruct
    public void init() {
        stories.add(new UserStory(1, "title1", "story1", "criteria1", 100, 2, "in progress"));
        stories.add(new UserStory(2, "title2", "story2", "criteria2", 100, 2, "in progress"));

    }

    public List<UserStory> findAll() {
        return stories;
    }

    public void saveUserStory(UserStory userStory) {
        stories.add(userStory);
    }
}
