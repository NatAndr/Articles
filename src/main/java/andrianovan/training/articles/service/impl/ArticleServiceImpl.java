package andrianovan.training.articles.service.impl;

import andrianovan.training.articles.model.ArticleTableRow;
import andrianovan.training.articles.repository.ArticleRepository;
import andrianovan.training.articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natal on 10-Jul-17.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<ArticleTableRow> getArticlesByType(long typeId) {
        List<Object[]> articlesByType = articleRepository.getArticlesByType(typeId);
        List<ArticleTableRow> articleTableRows = new ArrayList<>();
        if (!articlesByType.isEmpty()) {
            for (Object[] obj : articlesByType) {
                articleTableRows.add(new ArticleTableRow(String.valueOf(obj[0]), String.valueOf(obj[1]), String.valueOf(obj[2])));
            }
        }
        return articleTableRows;
    }
}
