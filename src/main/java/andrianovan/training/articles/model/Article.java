package andrianovan.training.articles.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by natal on 10-Jul-17.
 */
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "typeid")
    private ArticleType typeId;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "article_link",
            joinColumns = {@JoinColumn(name = "article1_id")},
            inverseJoinColumns = {@JoinColumn(name = "article2_id")})
    private Set<Article> links = new HashSet<>();

    @ManyToMany(mappedBy = "links")
    private Set<Article> linked = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArticleType getTypeId() {
        return typeId;
    }

    public void setTypeId(ArticleType typeId) {
        this.typeId = typeId;
    }

    public Set<Article> getLinks() {
        return links;
    }

    public void setLinks(Set<Article> links) {
        this.links = links;
    }

    public Set<Article> getLinked() {
        return linked;
    }

    public void setLinked(Set<Article> linked) {
        this.linked = linked;
    }
}
