package the.eric.article.mapper;

import the.eric.my.mapper.MyMapper;
import the.eric.pojo.Comments;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsMapper extends MyMapper<Comments> {
}