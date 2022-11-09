package com.example.trelloApi.dto.workspace;

import com.example.trelloApi.domains.auth.AuthUser;
import com.example.trelloApi.dto.base.BaseGenericDto;
import com.example.trelloApi.enums.workspace.WorkspaceType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceCreateDto implements BaseGenericDto {
    private String name;
    private Long userId;
    private WorkspaceType type;
    private String description;
}
