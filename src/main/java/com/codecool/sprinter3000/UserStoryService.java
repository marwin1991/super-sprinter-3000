package com.codecool.sprinter3000;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserStoryService {
    private final UserStoryRepository userStoryRepository;

    public List<UserStory> getAllStories(){
        return userStoryRepository.findAll();
    }

    public void add(UserStory userStory){
        userStoryRepository.save(userStory);
    }
}
