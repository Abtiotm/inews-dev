package the.eric.user.mapper;

import the.eric.my.mapper.MyMapper;
import the.eric.pojo.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserMapper extends MyMapper<AppUser> {
}