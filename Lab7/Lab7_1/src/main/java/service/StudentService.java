package service;

import module.Student;
    public interface StudentService {

        public Iterable<Student> getAllStudents();

        public Student getStudentById(Long id);

        public void deleteStudentById(Long id);

        public void saveOrUpdateStudent(Student student);
    }

