package com.sv.hrworker.resources;

import com.sv.hrworker.entities.Worker;
import com.sv.hrworker.repositories.WorkerRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepositorie repositorie;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){

        List<Worker> workers = repositorie.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){

        Worker worker = repositorie.findById(id).get();
        return  ResponseEntity.ok(worker);
    }

}
