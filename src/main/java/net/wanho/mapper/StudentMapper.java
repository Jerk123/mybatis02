package net.wanho.mapper;

import net.wanho.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {


    List<Student> getStuByConditionIf(Student student);

    List<Student> getStuByConditionChoose(Student student);

    List<Student> getStuByConditionWhere(Student student);

    List<Student> getStuByConditionTrim(Student student);

    void updateStuByConditionSet(Student student);

    List<Student> getStuByConditionForeach(List<Integer> ids);

    List<Student> getStuByConditionForeach2(int[] ids);

    List<Student> getStuByConditionForeach3(Map<String, Object> map);

    void insertStuBatch(List<Student> students);


}
