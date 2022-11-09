package com.example.trelloApi.dto.comment;

import com.example.trelloApi.domains.auth.AuthUser;
import com.example.trelloApi.domains.board.Card;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDto {
    private Long id;
    private String creator;
    private String text;
    private String attachment;
    private Long cardId;
}
