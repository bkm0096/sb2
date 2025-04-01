package org.rabe.sb2.board.repository;

import org.rabe.sb2.board.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardSearch{
    
}
