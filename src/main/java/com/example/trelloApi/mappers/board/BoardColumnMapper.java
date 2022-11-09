package com.example.trelloApi.mappers.board;

import com.example.trelloApi.domains.board.BoardColumn;
import com.example.trelloApi.dto.boardColumn.BoardColumnCreateDto;
import com.example.trelloApi.dto.boardColumn.BoardColumnDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring",
        uses = {CardMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BoardColumnMapper {
    BoardColumn fromCreateDto(BoardColumnCreateDto dto);

    @Mapping(target = "boardId", source = "board.id")
    BoardColumnDto fromBoardColumn(BoardColumn boardColumn);
}
