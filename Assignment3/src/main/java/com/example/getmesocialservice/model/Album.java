package com.example.getmesocialservice.model;

public class Album {

    private int id;
    private String name;
    private String createdBy;
    private String coverPhotoUrl;
    private String dateCreated;

    public Album(int id, String name, String createdBy, String coverPhotoUrl, String dateCreated) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.coverPhotoUrl = coverPhotoUrl;
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }
}