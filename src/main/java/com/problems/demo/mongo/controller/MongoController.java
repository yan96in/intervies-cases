package com.problems.demo.mongo.controller;

import com.mongodb.util.JSON;
import com.problems.demo.mongo.model.MailMsg;
import com.problems.demo.mongo.service.MailHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public class MongoController {
    @Autowired
    private MailHelper mailHelper;
    @RequestMapping("/find/to")
    public String findMailByTo(HttpServletRequest request, String to) {
        MailMsg msg = mailHelper.findByTo(to);
        if (msg == null)
            return "not found by to " + to;
        //return JSON.toJSONString(msg);
        return "";
    }
    }
