package com.sv.hrworker.repositories;

import com.sv.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepositorie extends JpaRepository<Worker, Long> {
}
