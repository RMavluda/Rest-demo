package mvc.restdemo.controller;

import mvc.restdemo.entity.Employee;
import mvc.restdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
//        var allEmployees = List.of(new Employee(1,"Mavluda", "Raximquliyeva", "uzinfocom", 5_000));
        return allEmployees;
    }
//
//    @PostMapping("/employees")
//    public ResponseEntity<Void> create () {
//        return ResponseEntity.ok(null);
//    }


}
