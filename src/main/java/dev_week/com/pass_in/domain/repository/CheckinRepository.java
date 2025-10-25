package dev_week.com.pass_in.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev_week.com.pass_in.domain.entity.checkin.CheckIn;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer>{
    
}
