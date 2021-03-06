package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Idea {

    private static int ideaCount = 0;
    private int idIdea;
    private String title;
    private String content;
    private Date publishDate;
    private int idAuthor;
    private String picture;
    private int idCategory;
    private boolean isDeleted;
    public Idea(String title, String content, int idAuthor) {
        this.idIdea = ideaCount++;
        this.title = title;
        this.content = content;
        this.idAuthor = idAuthor;
        this.publishDate = new Date();
        isDeleted = false;
    }

    public int getId() {
        return idIdea;
    }

    public void setId(int idIdea) {
        this.idIdea = idIdea;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int author) {
        this.idAuthor = author;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getCategory() {
        return idCategory;
    }

    public void setCategory(int category) {
        this.idCategory = category;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishDate=" + DateManager.formatDate(publishDate) +
                ", author=" + idAuthor +
                ", category=" + idCategory +
                '}';
    }
}
