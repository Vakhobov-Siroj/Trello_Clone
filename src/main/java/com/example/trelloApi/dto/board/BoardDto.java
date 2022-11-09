package com.example.trelloApi.dto.board;

import com.example.trelloApi.domains.board.BoardColumn;
import com.example.trelloApi.domains.workspace.Workspace;
import com.example.trelloApi.dto.boardColumn.BoardColumnDto;
import com.example.trelloApi.enums.board.BoardVisibilityType;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
    private Long id;
    private String name;
    private BoardVisibilityType visibilityType;
    private Long workspaceId;
    private Set<BoardColumnDto> boardColumns;
}
