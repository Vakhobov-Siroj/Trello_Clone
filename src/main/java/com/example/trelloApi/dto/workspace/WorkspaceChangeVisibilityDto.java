package com.example.trelloApi.dto.workspace;

import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceChangeVisibilityDto {
    private Long id;
    private Boolean visibility;
}
