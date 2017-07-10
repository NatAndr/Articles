package andrianovan.training.articles.model;

/**
 * Created by natal on 10-Jul-17.
 */
public class ArticleTableRow {
    private String name;
    private String count1;
    private String count2;

    public ArticleTableRow(String name, String count1, String count2) {
        this.name = name;
        this.count1 = count1;
        this.count2 = count2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount1() {
        return count1;
    }

    public void setCount1(String count1) {
        this.count1 = count1;
    }

    public String getCount2() {
        return count2;
    }

    public void setCount2(String count2) {
        this.count2 = count2;
    }
}
