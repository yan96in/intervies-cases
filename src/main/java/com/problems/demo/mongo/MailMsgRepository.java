package com.problems.demo.mongo;

import com.problems.demo.mongo.model.MailMsg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailMsgRepository extends MongoRepository<MailMsg, Long> {
    MailMsg findByTo(String to);
}
