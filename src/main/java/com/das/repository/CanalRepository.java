package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Canal;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Long>{

}
