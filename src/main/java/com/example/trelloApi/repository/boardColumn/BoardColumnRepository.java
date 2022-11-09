package com.example.trelloApi.repository.boardColumn;

import com.example.trelloApi.domains.board.BoardColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BoardColumnRepository extends JpaRepository<BoardColumn, Long> {
}
