package com.example.trelloApi.service.board;

import com.example.trelloApi.dto.board.BoardChangeVisibilityDto;
import com.example.trelloApi.dto.board.BoardCreateDto;
import com.example.trelloApi.dto.board.BoardDto;

public interface BoardService {
    BoardDto save(BoardCreateDto dto);

    BoardDto get(Long id);

    void changeVisibility(BoardChangeVisibilityDto dto);

    void deleteBoard(Long id);
}
