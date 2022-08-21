package in.ac.charusat.controller;

import in.ac.charusat.model.Employee20it051;
import in.ac.charusat.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class EmployeeContoller
{
   @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("listEmployees")
    public List<Employee20it051> getAllStudents()
    {
        return employeeRepository.findAll();
    }
    @PostMapping("/employee")
    public List<Employee20it051> addStudent(@RequestBody Employee20it051 emp)
    {
        employeeRepository.save(emp);
        return employeeRepository.findAll();
    }
    @DeleteMapping("/delete/{id}")
    public List<Employee20it051> deleteEmployee(@PathVariable Integer id)
    {
        employeeRepository.delete(employeeRepository.findById(id).get());
        return employeeRepository.findAll();
    }

}
