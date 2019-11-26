package Spring.webprogram.service;

import Spring.webprogram.dao.MysqlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDao {
//
    @Autowired
    private MysqlDao mysqlDao;

    public void select(){
        mysqlDao.select();
        System.out.println(mysqlDao.select());
    }

    public void s(){
        System.out.println("dddd");
    }
}

