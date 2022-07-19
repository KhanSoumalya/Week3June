package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.WebEntity;


@Repository
public interface WebRepo extends JpaRepository<WebEntity, Integer> {

}
