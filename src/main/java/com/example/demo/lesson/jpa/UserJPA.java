package com.example.demo.lesson.jpa;

import com.example.demo.lesson.untity.UserUntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJPA extends
        JpaRepository<UserUntity, Long>,
        JpaSpecificationExecutor<UserUntity>,
        Serializable {
}
