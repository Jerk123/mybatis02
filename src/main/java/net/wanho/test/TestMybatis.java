package net.wanho.test;

import net.wanho.mapper.StudentMapper;
import net.wanho.pojo.Student;
import net.wanho.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestMybatis {


    private SqlSession sqlSession;

    private StudentMapper studentMapper;

    @Before
    public void before() {

      /*  InputStream inputStream = TestMybatis.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
//        创建会话
        sqlSession = sf.openSession();*/

        sqlSession=MybatisUtil.getSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    @Test
    public void testIf() {
        Student student = new Student();
//        student.setSname("赵");
//        student.setAge(12);

        List<Student> stus = studentMapper.getStuByConditionIf(student);
        System.out.println(stus);
    }


    @Test
    public void testChoose() {
        Student student = new Student();
//        student.setSname("赵");
//        student.setAge(12);

        List<Student> stus = studentMapper.getStuByConditionChoose(student);
        System.out.println(stus);
    }

    @Test
    public void testWhere() {
        Student student = new Student();
        student.setSname("赵");
        student.setAge(12);

        List<Student> stus = studentMapper.getStuByConditionWhere(student);
        System.out.println(stus);
    }


    @Test
    public void testTrim() {
        Student student = new Student();
//        student.setSname("赵");
//        student.setAge(12);

        List<Student> stus = studentMapper.getStuByConditionTrim(student);
        System.out.println(stus);
    }

    @Test
    public void testSet() {
        Student student = new Student();
        student.setId(76);
        student.setSname("赵");
        student.setAge(12);

        studentMapper.updateStuByConditionSet(student);
        sqlSession.commit();
//        System.out.println(stus);
    }

    @Test
    public void testForeach() {
        List<Student> stus = studentMapper.getStuByConditionForeach(Arrays.asList(20, 30, 40));
        System.out.println(stus);
    }

    @Test
    public void testForeach2() {
        int[] ids = {20, 30, 40};
        List<Student> stus = studentMapper.getStuByConditionForeach2(ids);
        System.out.println(stus);
    }

    @Test
    public void testForeach3() {
        int[] ids = {20, 30, 40};
        Map<String, Object> map = new HashMap<>();
        map.put("ids", ids);
        List<Student> stus = studentMapper.getStuByConditionForeach3(map);
        System.out.println(stus);
    }

    @Test
    public void testInsertBatch() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(null, "张三", 16, "男", "南京"));
        students.add(new Student(null, "张三", 16, "男", "南京"));
        students.add(new Student(null, "张三", 16, "男", "南京"));
        students.add(new Student(null, "张三", 16, "男", "南京"));
        students.add(new Student(null, "张三", 16, "男", "南京"));
        studentMapper.insertStuBatch(students);
        sqlSession.commit();
    }


}
