package the.eric.article.mapper;

import the.eric.my.mapper.MyMapper;
import the.eric.pojo.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
}