package andrianovan.training.articles.web;

import andrianovan.training.articles.model.ArticleTableRow;
import andrianovan.training.articles.model.ArticleType;
import andrianovan.training.articles.service.ArticleService;
import andrianovan.training.articles.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by natal on 10-Jul-17.
 */
@Controller
public class ArticleController {

    private final ArticleTypeService articleTypeService;
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleTypeService articleTypeService, ArticleService articleService) {
        this.articleTypeService = articleTypeService;
        this.articleService = articleService;
    }

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/typeList", method = RequestMethod.POST)
    public Iterable<ArticleType> getStudyGroupsList() {
        return articleTypeService.getAll();
    }

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public ModelAndView getArticleTable(@RequestParam("options") String value) {
        List<ArticleTableRow> articles = articleService.getArticlesByType(Long.valueOf(value));
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("articles", articles);
        return modelAndView;
    }
}
