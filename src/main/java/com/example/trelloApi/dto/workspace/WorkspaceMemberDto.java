package com.example.trelloApi.dto.workspace;

import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceMemberDto {
    private Long id;
    private String memberEmail;
}
