package com.back.jump2sb_2.answer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.jump2sb_2.answer.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
