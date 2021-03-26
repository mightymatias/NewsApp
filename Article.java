/*
Last update: 22 March 2021

The Article object contains all relevant data about a specific article.

Contributing authors: Austin Matias

 */

import org.json.JSONObject;

public class Article {

    private String title = "No title to show.";
    private String author = "No author to show.";
    private String description = "No description to show.";
    private String url = "No URL to show.";
    private String urlToImage = "No URL image to show";
    private String publishedAt = "No publishing date to show.";
    private String content = "No content to show.";

    public Article(){

    }

    public Article(JSONObject _object){
        try{
            this.title = _object.getString("title");
            this.author = _object.getString("author");
            this.description = _object.getString("description");
            this.url = _object.getString("url");
            this.urlToImage = _object.getString("urlToImage");
            this.publishedAt = _object.getString("publishedAt");
            this.content = _object.getString("content");

        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }
}
