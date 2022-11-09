package com.example.trelloApi.service.card;

import com.example.trelloApi.dto.card.CardAddMemberDto;
import com.example.trelloApi.dto.card.CardChangeColumnDto;
import com.example.trelloApi.dto.card.CardCreateDto;
import com.example.trelloApi.dto.card.CardDto;
import com.example.trelloApi.dto.comment.CommentCreateDto;

public interface CardService {
    CardDto save(CardCreateDto dto);

    CardDto addMember(CardAddMemberDto dto);

    CardDto addComment(CommentCreateDto dto);

    CardDto changeColumn(CardChangeColumnDto dto);

    void deleteCard(Long id);
}
