package com.example.trelloApi.dto.card;

import com.example.trelloApi.dto.auth.UserDto;
import com.example.trelloApi.dto.comment.CommentDto;
import lombok.*;

import java.util.List;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {
    private Long id;
    private String name;
    private Set<UserDto> members;
    //    private final List<Comment> comments = new ArrayList<>();
    private Long boardColumnId;
    private List<CommentDto> comments;
}
