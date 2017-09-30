package com.abunchtell.writeas.models;

import com.google.gson.annotations.SerializedName;

public class Collection {
    private String alias;
    private String title;
    private String description;
    private String url;
    private String email;
    private int views;
    @SerializedName("total_posts")
    private int totalPosts;

    public String getAlias() {
        return alias;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getURL() {
        return url;
    }

    public String getEmail() {
        return email;
    }

    public int getViews() {
        return views;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    /// Utility functions
    public String getDisplayName() {
        if (this.title != null && !this.title.isEmpty()) {
            return this.title;
        }
        return this.alias;
    }
}
