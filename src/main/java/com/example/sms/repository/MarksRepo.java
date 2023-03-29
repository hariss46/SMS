package com.example.sms.repository;

import com.example.sms.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepo extends JpaRepository<Marks, Integer> {
}
