package ru.arzhana.sitearzhana.entities;

public interface ArticleInterface {
    Article getArticleById(Long id);
    void saveArticle(Article article);
    Article addNewArticle(Article article);

}
