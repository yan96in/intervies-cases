package com.problems.demo.cases;

import com.problems.demo.cases.model.IcCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaseController {
    @Autowired
    private CaseService caseService;
    @GetMapping("/case/{type}")
    public List<IcCase> list(@PathVariable("type") int type){
        Assert.notNull(type,"u must assign the type value");
        return this.caseService.list(type);
    }
}
