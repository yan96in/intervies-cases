package com.problems.demo.cases;

import com.problems.demo.cases.dao.IcCaseMapper;
import com.problems.demo.cases.model.IcCase;
import com.problems.demo.cases.model.IcCaseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CaseServiceImpl implements CaseService{
    @Autowired
    private IcCaseMapper icCaseMapper;
    @Override
    @Cacheable(value = "content") //先从缓存中查询，如果没有则查询数据库.这里的value就是对应配置文件里面的名称
    @CacheEvict //清空缓存
    @CachePut //更新的时候刷新到缓存
    public List<IcCase> list(int type) {
        IcCaseExample example=new IcCaseExample();
        IcCaseExample.Criteria criteria=example.createCriteria();
        if(type!=0)
            criteria.andCaseTypeEqualTo(type);
        return this.icCaseMapper.selectByExample(example);
    }
}
