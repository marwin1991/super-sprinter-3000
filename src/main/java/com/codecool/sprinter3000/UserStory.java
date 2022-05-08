package com.codecool.sprinter3000;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserStory {
    private int id;
    private String title;
    private String description;
    private String acceptanceCriteria;
    private int businessValue;
    private int estimation;
    private StoryStatus status;
}
