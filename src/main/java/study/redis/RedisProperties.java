package study.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @Project : OCHServ
 * @Package : cn.dfcx.config
 * @Class : RedisProperties.java
 * @Description : Redis的配置信息
 * @author : zhaochunyang
 * @CreateDate : 2019-03-22 10:05:07
 * @version : V0.5
 * @Copyright : 2019 dfcx.com Inc. All rights reserved.
 * @Reviewed :
 * @UpateLog :    Name    Date    Reason/Contents
 *             ---------------------------------------
 *                ****    ****    ****
 *
 */
@Component
@ConfigurationProperties(prefix = "spring.data.redis")
public class RedisProperties {
    /**
     * 最大连接数
     */
    private Integer maxIdle;

    /**
     * 最小连接数
     */
    private Integer minIdle;

    /**
     * 服务器地址
     */
    private String host;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 密码
     */
    private String password;

    /**
     * 连接超时时间
     */
    private Integer timeout;

    /**
     * ShardedJedisPool used
     */
    private List<String> uri;

    /**
     * 最大实例数
     */
    private Integer maxTotal;

    /**
     * 连接池最大阻塞等待时间（使用负值表示没有限制）
     */
    private Long maxWait;

    /**
     *testOnBorrow
     */
    private Boolean testOnBorrow;


    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public List<String> getUri() {
        return uri;
    }

    public void setUri(List<String> uri) {
        this.uri = uri;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Long maxWait) {
        this.maxWait = maxWait;
    }

    public Boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    @Override
    public String toString() {
        return "RedisProperties{" +
                "maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", password='" + password + '\'' +
                ", timeout=" + timeout +
                ", uri=" + uri +
                ", maxTotal=" + maxTotal +
                ", maxWait=" + maxWait +
                ", testOnBorrow=" + testOnBorrow +
                '}';
    }
}
