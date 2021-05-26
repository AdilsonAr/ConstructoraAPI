package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	public Role findByRole(String role);
}
