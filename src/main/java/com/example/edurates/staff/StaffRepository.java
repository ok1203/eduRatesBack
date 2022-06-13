package com.example.edurates.staff;

import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
    public long countById(Integer id);
}
