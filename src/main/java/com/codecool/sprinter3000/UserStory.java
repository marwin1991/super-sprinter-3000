package com.codecool.sprinter3000;

public class UserStory {
    private int id;
    private String title;
    private String description;
    private String acceptanceCriteria;
    private int businessValue;
    private int estimation;
    private String status;

    public UserStory() {
    }

    public UserStory(int id, String title, String description, String acceptanceCriteria, int businessValue, int estimation, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.acceptanceCriteria = acceptanceCriteria;
        this.businessValue = businessValue;
        this.estimation = estimation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public int getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(int businessValue) {
        this.businessValue = businessValue;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
