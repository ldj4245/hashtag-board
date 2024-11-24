package com.example.hashtagboard.repository;

import com.example.hashtagboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}