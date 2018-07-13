package com.problems.demo.mongo.service;


import com.problems.demo.mongo.MailMsgRepository;
import com.problems.demo.mongo.model.MailMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailHelper {

    @Autowired
    private Environment env;

    //@Autowired
    //private JavaMailSender javaMailSender;

    @Autowired
    private MailMsgRepository mailMsgRepository;

    public void sendSimpleEmail(MailMsg mailMsg)
    {
        SimpleMailMessage msg = new SimpleMailMessage();
        //FIXME
       //msg.setFrom(env.getProperty(MailPropKey.EMAIL_FROM));
        msg.setTo(mailMsg.getTo());
        msg.setSubject(mailMsg.getSubject());
        msg.setText(mailMsg.getText());
        //javaMailSender.send(msg);
        mailMsgRepository.insert(mailMsg);
    }

    public MailMsg findByTo(String to) {
        return mailMsgRepository.findByTo(to);
    }
}