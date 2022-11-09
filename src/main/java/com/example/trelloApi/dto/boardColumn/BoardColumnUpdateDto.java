package com.example.trelloApi.dto.boardColumn;

import com.example.trelloApi.dto.base.GenericDto;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnUpdateDto extends GenericDto {
    private Long id;
    private String name;
    private Integer order;
    private Long boardId;
}
