package com.example.trelloApi.mappers.board;

import com.example.trelloApi.domains.board.Board;
import com.example.trelloApi.dto.board.BoardCreateDto;
import com.example.trelloApi.dto.board.BoardDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring", uses = {CommentMapper.class, BoardColumnMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BoardMapper {
    Board fromCreateDto(BoardCreateDto dto);

    @Mapping(target = "workspaceId", source = "workspace.id")
    BoardDto fromBoard(Board board);
}
