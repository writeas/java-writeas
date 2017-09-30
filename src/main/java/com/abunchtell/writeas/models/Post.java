package com.abunchtell.writeas.models;

import java.util.Date;

public class Post {
    private String id;
    private String slug;
    private String token;
    private String appearance;
    private String language;
    private boolean rtl;
    private boolean listed;
    private Date created;
    private Date updated;
    private String title;
    private String body;
    private String[] tags;
    private String[] images;
    private int views;
    private String font;
    private Collection collection;

    public String getID() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getToken() {
        return token;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isRtl() {
        return rtl;
    }

    public boolean isListed() {
        return listed;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String[] getTags() {
        return tags;
    }

    public String[] getImages() {
        return images;
    }

    public int getViews() {
        return views;
    }

    public String getFont() {
        return font;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }

    public void setListed(boolean listed) {
        this.listed = listed;
    }

    public void setCreated(long createdTimestamp) {
        this.created = new Date(createdTimestamp);
    }

    public void setUpdated(long updated) {
        this.updated = new Date(updated);
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
