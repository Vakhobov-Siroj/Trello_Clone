package com.example.trelloApi.dto.workspace;

import com.example.trelloApi.dto.base.GenericDto;
import com.example.trelloApi.enums.workspace.WorkspaceType;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceUpdateDto extends GenericDto {
    private Long id;
    private String name;
    private WorkspaceType type;
    private String description;
}
