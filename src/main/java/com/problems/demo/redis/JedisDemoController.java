package com.problems.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
@RequestMapping("/jedis")
public class JedisDemoController {


    @Autowired(required = false)//FIXME
    private JedisPool jedisPool;//注入JedisPool

    @RequestMapping(value = "/demo_set",method = RequestMethod.GET)
    @ResponseBody
    public String demo_set(){
        //获取ShardedJedis对象
        Jedis jedis = jedisPool.getResource();
        //存入键值对
        jedis.set("key2","hello jedis one");
        //回收ShardedJedis实例
        jedis.close();

        return "set";
    }

    @RequestMapping(value = "/demo_get",method = RequestMethod.GET)
    @ResponseBody
    public String demo_get(){
        Jedis jedis = jedisPool.getResource();
        //根据键值获得数据
        String result = jedis.get("key2");
        jedis.close();

        return result;
    }
}
