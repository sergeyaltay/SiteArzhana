package ru.arzhana.sitearzhana.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements ArticleInterface{
    private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);
    private ArticleRepository articleRepository;
    @Override
    public Article getArticleById(Long id) {
        return articleRepository.getReferenceById(id);
    }

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article addNewArticle(Article article) {
        return articleRepository.save(article);
    }
}
