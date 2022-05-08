package com.codecool.sprinter3000;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public record UserStoryService(UserStoryRepository userStoryRepository) {

    public List<UserStory> getAll() {
        return userStoryRepository.findAll();
    }

    public void addUserStory(UserStory userStory) {
        userStory.setId(new Random().nextInt());
        userStoryRepository.save(userStory);
    }


}
