package com.example.trelloApi.dto.boardColumn;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnOrderChangeDto {
    private Long id;
    private Integer order;
}
