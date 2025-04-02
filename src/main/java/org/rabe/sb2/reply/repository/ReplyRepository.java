package org.rabe.sb2.reply.repository;

import org.rabe.sb2.reply.entities.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long>{
  
}