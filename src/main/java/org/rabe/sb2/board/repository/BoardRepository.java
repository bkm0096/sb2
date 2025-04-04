package org.rabe.sb2.board.repository;

import org.rabe.sb2.board.dto.BoardReadDTO;
import org.rabe.sb2.board.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardSearch{

// //bno, title, content, writer, delFlag, viewCnt, regDate, modDate
// @Query("select new org.rabe.sb2.board.dto.BoardReadDTO(b.bno, b.title, b.writer, b.delFlag, b.viewCnt, b.regDate, b.modDate)  " +
// " from Board b where b.bno = :bno")
// BoardReadDTO selectOne( @Param("bno") Long bno);
}
