package com.example.rest_api.ServiceLayer;

import com.example.rest_api.Worker;

import java.util.List;

public interface WorkerService {
    Worker saveWorker(Worker worker);
    List<Worker> getAll();

    Worker getElementById(Integer id);

    Worker updateWorker(Worker worker, Integer id);

    Void deleteWorker(Integer id);

}
