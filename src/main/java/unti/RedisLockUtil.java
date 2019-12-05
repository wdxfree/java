package unti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

@Component
public class RedisLockUtil {

    @Autowired
    private JedisCluster jedisCluster;


    public boolean lock(String key, Long expire){
        Long res = jedisCluster.setnx(key, String.valueOf(System.currentTimeMillis() + expire));
        if (res==1L){
            return true;
        }else {
            String s = jedisCluster.get(key);
            if (s!=null && System.currentTimeMillis()>Long.parseLong(s)){ //相当于过期时间
                Long del = jedisCluster.del(key);
                if (del==1L){
                    Long setnx = jedisCluster.setnx(key, String.valueOf(System.currentTimeMillis() + expire));
                    if (setnx==1L){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean unlock(String key){
        Long del = jedisCluster.del(key);
        if (del==1L)
            return true;
        return false;
    }
}
