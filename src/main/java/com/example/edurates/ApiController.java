package com.example.edurates;


import com.example.edurates.staff.Staff;
import com.example.edurates.staff.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private StaffRepository staffRepo;

    @GetMapping("/Api/staff")
    public List<Staff> listAll() {
        return (List<Staff>) staffRepo.findAll();
    }

    @PostMapping("/Api/save")
    public List<Staff> save(@RequestBody Staff staff) {
        staffRepo.save(staff);
        return (List<Staff>) staffRepo.findAll();
    }

    @PutMapping("/Api/update/{id}")
    public List<Staff> update(@PathVariable Integer id, @RequestBody Staff staff){
        Staff updatedStaff = staffRepo.findById(id).get();
        updatedStaff.setExperience(staff.getExperience());
        updatedStaff.setName(staff.getName());
        updatedStaff.setPosition(staff.getPosition());
        updatedStaff.setRating(staff.getRating());
        updatedStaff.setSubject(staff.getSubject());
        updatedStaff.setSchool(staff.getSchool());
        staffRepo.save(updatedStaff);
        return (List<Staff>) staffRepo.findAll();
    }

    @DeleteMapping("/Api/delete/{id}")
    public List<Staff> delete(@PathVariable Integer id){
        Staff deletedStaff = staffRepo.findById(id).get();
        staffRepo.delete(deletedStaff);
        return (List<Staff>) staffRepo.findAll();
    }

}
