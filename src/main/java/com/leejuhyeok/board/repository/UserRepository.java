package com.leejuhyeok.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leejuhyeok.board.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
