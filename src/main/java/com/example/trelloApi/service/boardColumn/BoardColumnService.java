package com.example.trelloApi.service.boardColumn;

import com.example.trelloApi.dto.boardColumn.BoardColumnCreateDto;
import com.example.trelloApi.dto.boardColumn.BoardColumnDto;
import com.example.trelloApi.dto.boardColumn.BoardColumnOrderChangeDto;

public interface BoardColumnService {
    BoardColumnDto save(BoardColumnCreateDto dto);

    BoardColumnDto changeOrder(BoardColumnOrderChangeDto dto);

    void deleteColumn(Long id);
}
