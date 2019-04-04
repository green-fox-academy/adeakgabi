package com.greenfox.springadv.model;

public class DTO {

    private Long id;
    private String dtoUserName;
    private User user;

    public DTO() {
    }

    public DTO(Long id, String dtoUserName) {
        this.id = id;
        this.dtoUserName = dtoUserName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = user.getId();
    }

    public String getDtoUserName() {
        return dtoUserName;
    }

    public void setDtoUserName(String dtoUserName) {
        this.dtoUserName = user.getUserName();
    }
}
