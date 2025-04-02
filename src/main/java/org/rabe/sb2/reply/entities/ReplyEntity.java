package org.rabe.sb2.reply.entities;

import java.time.LocalDateTime;

import org.rabe.sb2.board.entities.BoardEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import groovy.transform.ToString;
import groovy.transform.builder.Builder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EntityListeners(value = AuditingEntityListener.class)
@Entity
@Table(name = "tbl_reply" , indexes = {
  @Index(name = "idx_board", columnList = "board_bno")
})
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long rno;

  private String replyText;

  private String replyer;

  @ManyToOne
  private BoardEntity board;

  @CreatedDate
  @Column(name = "regdate", updatable = false)
  protected LocalDateTime regDate;

  @LastModifiedDate
  @Column(name ="moddate" )
  protected LocalDateTime modDate;
  
}