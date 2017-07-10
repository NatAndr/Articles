package andrianovan.training.articles.service.impl;

import andrianovan.training.articles.model.ArticleType;
import andrianovan.training.articles.repository.ArticleTypeRepository;
import andrianovan.training.articles.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by natal on 10-Jul-17.
 */
@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    private final ArticleTypeRepository articleTypeRepository;

    @Autowired
    public ArticleTypeServiceImpl(ArticleTypeRepository articleTypeRepository) {
        this.articleTypeRepository = articleTypeRepository;
    }

    @Override
    public Iterable<ArticleType> getAll() {
        return articleTypeRepository.findAll();
    }
}
