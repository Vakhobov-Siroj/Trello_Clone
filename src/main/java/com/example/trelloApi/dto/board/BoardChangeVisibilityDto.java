package com.example.trelloApi.dto.board;

import com.example.trelloApi.enums.board.BoardVisibilityType;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardChangeVisibilityDto {
    private Long id;
    private BoardVisibilityType visibility;
}
