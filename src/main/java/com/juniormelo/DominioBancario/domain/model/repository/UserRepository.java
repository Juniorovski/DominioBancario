package com.juniormelo.DominioBancario.domain.model.repository;

import com.juniormelo.DominioBancario.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
