package Spring.webprogram.dao;

import Spring.webprogram.pojo.NameUtil;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MysqlDao {
    NameUtil select();
}
