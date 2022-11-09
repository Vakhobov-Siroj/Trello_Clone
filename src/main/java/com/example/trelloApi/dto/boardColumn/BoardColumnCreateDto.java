package com.example.trelloApi.dto.boardColumn;

import com.example.trelloApi.dto.base.BaseGenericDto;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnCreateDto implements BaseGenericDto {
    private String name;
    private Integer order;
    private Long boardId;
}
