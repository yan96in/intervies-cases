package com.problems.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
@Controller
@RequestMapping("/sharedRedis")
public class SharedRedisDemoController {
    @Autowired(required = false)//FIXME
    private ShardedJedisPool shardedJedisPool;//注入ShardedJedisPool

    @RequestMapping(value = "/demo_set",method = RequestMethod.GET)
    @ResponseBody
    public String demo_set(){
        //获取ShardedJedis对象
        ShardedJedis shardJedis = shardedJedisPool.getResource();
        //存入键值对
        shardJedis.set("key1","hello jedis");
        //回收ShardedJedis实例
        shardJedis.close();

        return "set";
    }

    @RequestMapping(value = "/demo_get",method = RequestMethod.GET)
    @ResponseBody
    public String demo_get(){
        ShardedJedis shardedJedis = shardedJedisPool.getResource();
        //根据键值获得数据
        String result = shardedJedis.get("key1");
        shardedJedis.close();

        return result;
    }

}
