package com.problems.demo.cases;

import com.problems.demo.cases.dao.IcCaseMapper;
import com.problems.demo.cases.model.IcCase;
import com.problems.demo.cases.model.IcCaseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CaseServiceImpl implements CaseService{
    @Autowired
    private IcCaseMapper icCaseMapper;
    @Override
    public List<IcCase> list(int type) {
        IcCaseExample example=new IcCaseExample();
        IcCaseExample.Criteria criteria=example.createCriteria();
        if(type!=0)
            criteria.andCaseTypeEqualTo(type);
        return this.icCaseMapper.selectByExample(example);
    }
}
