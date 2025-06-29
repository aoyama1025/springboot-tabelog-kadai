package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.Term;

public interface RermRepository extends JpaRepository<Term, Integer>{
	public Term findFirstByOrderByIdDesc();
}
