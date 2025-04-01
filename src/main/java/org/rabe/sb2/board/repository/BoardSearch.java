package org.rabe.sb2.board.repository;

import org.rabe.sb2.board.dto.BoardListDTO;
import org.rabe.sb2.board.dto.PageRequestDTO;
import org.rabe.sb2.board.dto.PageResponseDTO;

public interface BoardSearch {
    
      PageResponseDTO<BoardListDTO> list(PageRequestDTO pageRequestDTO);

}
