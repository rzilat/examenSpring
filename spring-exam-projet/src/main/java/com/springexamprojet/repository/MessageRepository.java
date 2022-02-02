package com.springexamprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springexamprojet.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
