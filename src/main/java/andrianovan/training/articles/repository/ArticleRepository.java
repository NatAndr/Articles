package andrianovan.training.articles.repository;

import andrianovan.training.articles.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by natal on 10-Jul-17.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Query(value = "select s.name as name, count(t.id) as count1, count(tt.id) as count2 " +
            "from articles s " +
            "left join article_link k on s.id = k.article1_id " +
            "left join articles t on k.article2_id = t.id and t.typeid = 4 " +
            "left join articles tt on k.article2_id = tt.id and tt.typeid = 5 " +
            "where s.typeid = ?1 " +
            "group by s.name " +
            "order by s.name", nativeQuery = true)
    List<Object[]> getArticlesByType(long typeId);
}
