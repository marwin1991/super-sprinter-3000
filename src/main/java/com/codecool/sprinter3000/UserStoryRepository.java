package com.codecool.sprinter3000;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserStoryRepository {
    private final List<UserStory> userStories = new ArrayList<>();

    @PostConstruct
    public void init() {
        userStories.add(new UserStory(0, "Story 1", "String description", "String acceptanceCriteria", 200, 5, StoryStatus.IN_PROGRESS));
    }

    public List<UserStory> findAll(){
        return userStories;
    }


}
