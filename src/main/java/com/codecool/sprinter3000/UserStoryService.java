package com.codecool.sprinter3000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStoryService {

    private final UserStoryRepository userStoryRepository;

    @Autowired
    public UserStoryService(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }
}
