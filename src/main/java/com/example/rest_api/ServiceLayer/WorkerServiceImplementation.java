package com.example.rest_api.ServiceLayer;

import com.example.rest_api.ResoureNotFoundException;
import com.example.rest_api.Worker;
import com.example.rest_api.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServiceImplementation implements WorkerService {


    private WorkerRepository workerRepository;
    @Autowired
    public WorkerServiceImplementation(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public Worker saveWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public List<Worker> getAll() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getElementById(Integer id) {
        Optional<Worker> worker = workerRepository.findById(id);
        if(worker.isPresent()){
            return worker.get();
        } else {
            throw new ResoureNotFoundException("Worker","id",id);
        }
    }

    @Override
    public Worker updateWorker(Worker work, Integer id) {
        Worker existingWorker = workerRepository.findById(id).orElseThrow(()-> new ResoureNotFoundException("Worker","id",id));
        existingWorker.setName(work.getName());
        existingWorker.setAddress(work.getAddress());
        existingWorker.setSalary(work.getSalary());
        return workerRepository.save(existingWorker);

    }

    @Override
    public Void deleteWorker(Integer id) {
        Worker existingWorker = workerRepository.findById(id).orElseThrow(() -> new ResoureNotFoundException("Worker","id",id));
        workerRepository.delete(existingWorker);
        return null;
    }



}
