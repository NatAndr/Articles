package andrianovan.training.articles.service;

import andrianovan.training.articles.model.ArticleTableRow;

import java.util.List;

/**
 * Created by natal on 10-Jul-17.
 */
public interface ArticleService {
    List<ArticleTableRow> getArticlesByType(long typeId);
}
