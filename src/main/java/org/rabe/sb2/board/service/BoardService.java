package org.rabe.sb2.board.service;

import org.rabe.sb2.board.dto.BoardListDTO;
import org.rabe.sb2.board.dto.PageRequestDTO;
import org.rabe.sb2.board.dto.PageResponseDTO;

public interface BoardService {
  
    PageResponseDTO<BoardListDTO> list(PageRequestDTO requestDTO);
  
  }