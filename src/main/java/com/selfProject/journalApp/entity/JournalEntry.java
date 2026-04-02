package com.selfProject.journalApp.entity;

public class JournalEntry {
    private long id;//unique id

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {                                 //used setter and getter method
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String title;
    private String content;


}
