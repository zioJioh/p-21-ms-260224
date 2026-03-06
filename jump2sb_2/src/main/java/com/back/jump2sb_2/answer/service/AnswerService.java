package com.back.jump2sb_2.answer.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.back.jump2sb_2.answer.entity.Answer;
import com.back.jump2sb_2.answer.repository.AnswerRepository;
import com.back.jump2sb_2.question.entity.Question;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnswerService {

	private final AnswerRepository answerRepository;

	public void create(Question question, String content) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		this.answerRepository.save(answer);
	}

}
