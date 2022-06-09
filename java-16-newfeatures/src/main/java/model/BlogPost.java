package model;

import constant.BlogPostType;

import java.util.IntSummaryStatistics;

public class BlogPost {
    private String title;
    private String author;
    private BlogPostType type;
    private int likes;

    public record AuthPostTypesLikes(String author, BlogPostType type, int likes) {};
    public record PostcountTitlesLikesStats(long postCount, String titles, IntSummaryStatistics likesStats){};
    public record TitlesBoundedSumOfLikes(String titles, int boundedSumOfLikes) {};

    public BlogPost(String title, String author, BlogPostType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BlogPostType getType() {
        return type;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "BlogPost{" + "title='" + title + '\'' + ", type=" + type + ", likes=" + likes + '}';
    }
}
