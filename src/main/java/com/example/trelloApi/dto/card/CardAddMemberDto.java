package com.example.trelloApi.dto.card;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardAddMemberDto {
    private Long id;
    private String memberEmail;
}
