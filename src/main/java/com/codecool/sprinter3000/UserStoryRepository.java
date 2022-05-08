package com.codecool.sprinter3000;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
}
