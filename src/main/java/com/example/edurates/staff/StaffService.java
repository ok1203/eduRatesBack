package com.example.edurates.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired private StaffRepository repo;

    public List<Staff> listAll() {
        return (List<Staff>) repo.findAll();
    }

    public void save(Staff staff) {
        repo.save(staff);
    }

    public Staff get(Integer Id) throws StaffNotFoundException {
        Optional<Staff> result = repo.findById(Id);
        if(result.isPresent()){
            return result.get();
        }
        throw new StaffNotFoundException("Could not found any users with id " + Id);
    }

    public void delete(Integer id) throws StaffNotFoundException {
        Long count = repo.countById(id);
        if (count == null){
            throw new StaffNotFoundException("Could not found any users with id " + id);
        }
        if (count == 0){
            throw new StaffNotFoundException("Could not found any users with id " + id);
        }
        repo.deleteById(id);
    }

}
