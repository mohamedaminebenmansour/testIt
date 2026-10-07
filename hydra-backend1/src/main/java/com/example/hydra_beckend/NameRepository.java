package com.example.hydra_beckend;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<TestName, Long> {
}
