//package study.redis;
//
//import jdk.nashorn.internal.ir.annotations.Reference;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.JedisCluster;
//import redis.clients.jedis.JedisPoolConfig;
//import redis.clients.util.JedisURIHelper;
//
//import java.net.URI;
//import java.util.HashSet;
//import java.util.Set;
//
///**
// *
// * @Project : OCHServ
// * @Package : cn.dfcx.ochserv.system.config
// * @Class : RedisConfig
// * @Description : RedisConfig
// * @author : zhaochunyang
// * @CreateDate : 2019-03-22 10:05:03
// * @version : V0.5
// * @Copyright : 2019 dfcx.com Inc. All rights reserved.
// * @Reviewed :
// * @UpateLog :    Name    Date    Reason/Contents
// *             ---------------------------------------
// *                ****    ****    ****
// *
// */
//@Configuration
//public class RedisConfig {
//
//    @Reference
//    private RedisProperties redisProperties;
////    @Bean
////    public JedisPool redisPoolFactory() {
////        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
////        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
////        jedisPoolConfig.setMaxWaitMillis(redisProperties.getMaxWait());
////        JedisPool jedisPool = new JedisPool(jedisPoolConfig, redisProperties.getHost(),redisProperties.getPort(),
////                redisProperties.getTimeout(), redisProperties.getPassword());
////        return jedisPool;
////    }
//
//    /***
//     *
//     * @Method : redisShardedPool
//     * @Description : 配置Redis的连接池
//     * @return : redis.clients.jedis.ShardedJedisPool Redis的连接池对象
//     * @author : gongqinglong
//     * @CreateDate : 2019-03-28 11:26:44
//     *
//     */
///*    @Bean
//    public ShardedJedisPool redisShardedPool(){
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxTotal(redisProperties.getMaxTotal());
//        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
//        jedisPoolConfig.setMaxWaitMillis(redisProperties.getMaxWait());
//        jedisPoolConfig.setTestOnBorrow(redisProperties.getTestOnBorrow());
//        List<JedisShardInfo> jedisShardInfoList = new ArrayList<>();
//        for(String uri : redisProperties.getUri()){
//            JedisShardInfo jedisShardInfo = new JedisShardInfo(uri);
//            jedisShardInfo.setConnectionTimeout(redisProperties.getTimeout());
//            jedisShardInfo.setSoTimeout(redisProperties.getTimeout());
//            if(StringUtils.isBlank(jedisShardInfo.getPassword())){
//                jedisShardInfo.setPassword(null);
//            }
//            jedisShardInfoList.add(jedisShardInfo);
//        }
//        return new ShardedJedisPool(jedisPoolConfig, jedisShardInfoList);
//    }*/
//    /**
//     *
//     * @Method : getJedisCluster
//     * @Description : 配置集群redis
//     * @return : redis.clients.jedis.JedisCluster
//     * @author : wangxichun
//     * @CreateDate : 2019-04-12 20:04:02
//     *
//     */
//    @Bean
//    public JedisCluster getJedisCluster() {
//        Set<HostAndPort> nodes = new HashSet<>();
//        // 分割出集群节点
//        String password = null;
//        for(String uri : redisProperties.getUri()){
//            URI host = URI.create(uri);
//            String jedisPwd = JedisURIHelper.getPassword(host);
//            if(StringUtils.isNotBlank(jedisPwd)){
//                password = jedisPwd;
//            }
//            nodes.add(new HostAndPort(host.getHost(), host.getPort()));
//        }
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxTotal(redisProperties.getMaxTotal());
//        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());
//        jedisPoolConfig.setMinIdle(redisProperties.getMinIdle());
//        jedisPoolConfig.setMaxWaitMillis(redisProperties.getMaxWait());
//        //在获取Jedis连接时，自动检验连接是否可用
//        jedisPoolConfig.setTestOnBorrow(Boolean.TRUE);
//        //在将连接放回池中前，自动检验连接是否有效
//        jedisPoolConfig.setTestOnReturn(Boolean.TRUE);
//        //自动测试池中的空闲连接是否都是可用连接
//        jedisPoolConfig.setTestWhileIdle(Boolean.TRUE);
//        //连接耗尽时是否阻塞, false报异常,ture阻塞直到超时,默认true
//        jedisPoolConfig.setBlockWhenExhausted(Boolean.TRUE);
//
//        //表示idle object evitor两次扫描之间要sleep的毫秒数
//        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(30000);
//        //表示idle object evitor每次扫描的最多的对象数
//        jedisPoolConfig.setNumTestsPerEvictionRun(10);
//        //表示一个对象至少停留在idle状态的最短时间，然后才能被idle object evitor扫描并驱逐；这一项只有在timeBetweenEvictionRunsMillis大于0时才有意义
//        jedisPoolConfig.setMinEvictableIdleTimeMillis(60000);
//        // 创建集群对象
//        return new JedisCluster(nodes, redisProperties.getTimeout(), redisProperties.getTimeout(),
//                redisProperties.getMaxIdle(), password, jedisPoolConfig);
//    }
//
//}
