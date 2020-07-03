package com.example.repository;

import com.example.model.NifiData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NifiRepository extends JpaRepository<NifiData, String> { }