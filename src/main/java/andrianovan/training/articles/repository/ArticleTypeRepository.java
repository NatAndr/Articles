package andrianovan.training.articles.repository;

import andrianovan.training.articles.model.ArticleType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by natal on 10-Jul-17.
 */
public interface ArticleTypeRepository extends CrudRepository<ArticleType, Long> {
}
