package study.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testLogger {
    public static final Logger logger=LoggerFactory.getLogger(testLogger.class);


//
    public boolean test(String ss){
        logger.info("这是一个测试",ss);
        return false;

    }

}