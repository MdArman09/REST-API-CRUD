package com.example.rest_api.Controller;

import com.example.rest_api.ServiceLayer.WorkerService;
import com.example.rest_api.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    private WorkerService workerService;
    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }
    @PostMapping("/abc")
    public ResponseEntity<Worker> saveW(@RequestBody Worker worker) {
        return new ResponseEntity<>(workerService.saveWorker(worker), HttpStatus.OK);
    }
    @GetMapping("/get")
    public List<Worker> findAll() {
        return workerService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Worker> getById(@PathVariable("id")Integer id) {
        return new ResponseEntity<>(workerService.getElementById(id), HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<String> updateWorker(@RequestBody Worker worker, @PathVariable Integer id) {
        workerService.updateWorker(worker, id);
        return new ResponseEntity<String>("Data Updated Successfully", HttpStatus.OK);
    }//in this we use ResponseEntity<Worker> this means

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteWorker(@PathVariable("id") Integer id) {
        workerService.deleteWorker(id);
        return new ResponseEntity<String>("Worker deleted successfully", HttpStatus.OK);
    }
}
