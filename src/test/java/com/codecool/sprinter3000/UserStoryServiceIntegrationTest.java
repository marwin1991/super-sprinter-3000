package com.codecool.sprinter3000;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@AutoConfigureDataJpa
@SpringBootTest
public class UserStoryServiceIntegrationTest {

    @Autowired
    private UserStoryService service;

    @Test
    public void test() {
        //given:
        UserStory userStory = UserStory.builder()
                .title("Test")
                .description("Test2")
                .acceptanceCriteria("Test3")
                .businessValue(1)
                .estimation(2)
                .status(StoryStatus.DONE)
                .build();

        //when:
        service.add(userStory);

        //then:
        List<UserStory> allStories = service.getAllStories();
        Assertions.assertThat(allStories.size()).isEqualTo(1);
        Assertions.assertThat(allStories.get(0).getTitle()).isEqualTo("Test");
    }
}
