package the.eric.user.mapper;

import the.eric.my.mapper.MyMapper;
import the.eric.pojo.Fans;
import org.springframework.stereotype.Repository;

@Repository
public interface FansMapper extends MyMapper<Fans> {
}