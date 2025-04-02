package org.reply;

import org.rabe.sb2.reply.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ReplyRepoTests {

    @Autowired(required = false)
    private ReplyRepository replyRepository;
    
}
