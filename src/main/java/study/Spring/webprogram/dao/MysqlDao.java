package study.Spring.webprogram.dao;

import study.Spring.webprogram.pojo.NameUtil;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MysqlDao {
    NameUtil select();
}
