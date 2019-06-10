package net.wanho.test;

import net.wanho.mapper.PersonMapper;
import net.wanho.mapper.StudentMapper;
import net.wanho.pojo.Person;
import net.wanho.pojo.PersonDto;
import net.wanho.pojo.Score;
import net.wanho.pojo.Student;
import net.wanho.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestMybatis2 {


    private SqlSession sqlSession;

    private PersonMapper personMapper;

    @Before
    public void before() {


        sqlSession=MybatisUtil.getSession();
        personMapper = sqlSession.getMapper(PersonMapper.class);
    }


    @Test
    public void getPersonCardInfo() {
        List<PersonDto> personCardInfo = personMapper.getPersonCardInfo();
        System.out.println(personCardInfo);
    }

    @Test
    public void getPersonCardInfo2() {
        List<Person> personCardInfo = personMapper.getPersonCardInfo2();
        System.out.println(personCardInfo);

    }

    @Test
    public void getPersonCardInfo3() {
        List<Person> personCardInfo = personMapper.getPersonCardInfo3();
//        System.out.println(personCardInfo);
//        personCardInfo.get(0).getCard();

    }

    @Test
    public void getPersonAddress() {
        List<Person> personAddress = personMapper.getPersonAddress();
        System.out.println(personAddress);
    }


    @Test
    public void getPersonAddress2() {
        List<Person> personAddress = personMapper.getPersonAddress2();
//        personAddress.get(0).getAddresses();
    }

    @Test
    public void getPersonScore() {
        List<Person> personScore = personMapper.getPersonScore();
        System.out.println(personScore);
//        personAddress.get(0).getAddresses();
    }


    @Test
    public void getPersonScore2() {

        List<Person> personScore = personMapper.getPersonScore2();
        personScore.get(0).getScores();
    }



    @Test
    public void getScorePersonAddress() {

        List<Score> scores = personMapper.getScorePersonAddress();
        System.out.println(scores.get(0).getPersonList().get(0).getAddresses());

    }

}
