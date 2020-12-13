package the.eric.admin.mapper;

import the.eric.my.mapper.MyMapper;
import the.eric.pojo.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserMapper extends MyMapper<AdminUser> {
}