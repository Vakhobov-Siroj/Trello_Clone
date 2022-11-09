package com.example.trelloApi.dto.card;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardChangeColumnDto {
    private Long id;
    private Long boardColumnId;
}
