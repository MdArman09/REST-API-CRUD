package com.example.rest_api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "worker_table")
public class Worker {
    @Id
    private int worker_id;
    private String name;
    private String address;
    private int salary;

    public Worker(int worker_id, String name, String address, int salary) {
        this.worker_id = worker_id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Worker() {

    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
