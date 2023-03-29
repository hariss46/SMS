package com.example.sms.repository;

import com.example.sms.model.StudentFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFeesRepo extends JpaRepository<StudentFees, Integer> {
}
