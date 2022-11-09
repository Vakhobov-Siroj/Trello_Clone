package com.example.trelloApi.dto.board;

import com.example.trelloApi.domains.workspace.Workspace;
import com.example.trelloApi.dto.base.BaseGenericDto;
import com.example.trelloApi.enums.board.BoardVisibilityType;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardCreateDto implements BaseGenericDto {
    private String name;
    @Builder.Default
    private BoardVisibilityType visibilityType = BoardVisibilityType.PUBLIC;
    private Long workspaceId;
}
