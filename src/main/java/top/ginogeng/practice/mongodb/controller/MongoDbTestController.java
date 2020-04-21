package top.ginogeng.practice.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.ginogeng.practice.mongodb.dao.StudentRepository;
import top.ginogeng.practice.mongodb.dao.UserRepository;
import top.ginogeng.practice.mongodb.entity.Student;
import top.ginogeng.practice.mongodb.entity.User;

import java.util.List;

/**
 * @ClassName MongoDbTestController
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 16:17
 * @Version V1.0
 **/
@RestController
@RequestMapping("/mongoDb/test")
public class MongoDbTestController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentRepository studentRepository;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/user")
    public List<User> getAllUsers() {
       return userRepository.findAll();
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }
}
