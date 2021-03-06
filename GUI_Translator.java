/*
Last Update: 30 April 2021

This class serves to interact between the articles and the GuiMain class.

Contributing authors: Austin Matias, Connor Contursi
 */
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GUI_Translator {

    //An arrayList containing all of the titles that need to be displayed on the GUI.
    protected ArrayList<String> titleList = new ArrayList<>();

    //An arrayList containing all of the authors that need to be displayed on the GUI.
    protected ArrayList<String> authorList = new ArrayList<>();

    //An arrayList containing all of the descriptions that need to be displayed on the GUI.
    protected ArrayList<String> descriptionList = new ArrayList<>();

    //An arrayList containing all of the URLs that need to be displayed on the GUI.
    protected ArrayList<String> urlList = new ArrayList<>();

    //An arrayList containing all of the header image URLs that need to be displayed on the GUI.
    protected ArrayList<String> imageUrlList = new ArrayList<>();

    private API_Translator translator = new API_Translator();

    /**
     * The default constructor for the translator.
     */
    public GUI_Translator(){}

    /**
     * This method fetches articles for a certain country.
     * @param _country The country for the articles to come from.
     * @return An arrayList containing the articles.
     */
    protected ArrayList<Article> fetchArticles(String _country){
        JSONObject topHeadlines = translator.sortByCountry(_country);
        return translator.getArrayListOfArticlesFromJSONObject(topHeadlines);
    }

    //=================  SETTERS ===============

    /**
     * This method takes an arrayList of Article objects, and populates titleList with the titles of every article
     * @param _articleList An arrayList of Article objects.
     * @return An arrayList containing titles of articles.
     */
    protected ArrayList<String> setTitleList(ArrayList<Article> _articleList){
        for (int i = 0; i < _articleList.toArray().length; i++){
            this.titleList.add(_articleList.get(i).getTitle());
        }
        return this.titleList;
    }

    /**
     * This method takes an arrayList of Article objects, and populates authorList with the authors of every article
     * @param _articleList An arrayList of Article objects.
     * @return An arrayList containing authors of articles.
     */
    protected ArrayList<String> setAuthorList(ArrayList<Article> _articleList){
        for (int i = 0; i < _articleList.toArray().length; i++){
            this.authorList.add(_articleList.get(i).getAuthor());
        }
        return this.authorList;
    }

    /**
     * This method takes an arrayList of Article objects, and populates descriptionList with the descriptions of every article
     * @param _articleList An arrayList of Article objects.
     * @return An arrayList containing descriptions of articles.
     */
    protected ArrayList<String> setDescriptionList(ArrayList<Article> _articleList){
        for (int i = 0; i < _articleList.toArray().length; i++){
            this.descriptionList.add(_articleList.get(i).getDescription());
        }
        return this.descriptionList;
    }

    /**
     * This method takes an arrayList of Article objects, and populates UrlList with the URLs of every article
     * @param _articleList An arrayList of Article objects.
     * @return An arrayList containing URLs of articles.
     */
    protected ArrayList<String> setUrlList(ArrayList<Article> _articleList){
        for (int i = 0; i < _articleList.toArray().length; i++){
            this.urlList.add(_articleList.get(i).getUrl());
        }
        return this.urlList;
    }

    /**
     * This method takes an arrayList of Article objects, and populates ImageUrlList with the header image URLs of every article
     * @param _articleList An arrayList of Article objects.
     * @return An arrayList containing header image URLs of articles.
     */
    protected ArrayList<String> setImageUrlList(ArrayList<Article> _articleList){
        for (int i = 0; i < _articleList.toArray().length; i++){
            this.imageUrlList.add(_articleList.get(i).getUrlToImage());
        }
        return this.imageUrlList;
    }
}

