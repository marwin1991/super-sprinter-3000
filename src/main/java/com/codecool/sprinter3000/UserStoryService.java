package com.codecool.sprinter3000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserStoryService {

    private final UserStoryRepository userStoryRepository;

    @Autowired
    public UserStoryService(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }

    public List<UserStory> getAll() {
        return userStoryRepository.findAll();
    }

    public void addUserStory(UserStory userStory) {
        userStory.setId(new Random().nextInt());
        userStoryRepository.saveUserStory(userStory);
    }


}
