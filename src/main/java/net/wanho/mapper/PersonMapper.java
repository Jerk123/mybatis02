package net.wanho.mapper;

import net.wanho.pojo.Person;
import net.wanho.pojo.PersonDto;
import net.wanho.pojo.Score;

import java.util.List;

public interface PersonMapper {

    List<PersonDto> getPersonCardInfo();
    List<Person> getPersonCardInfo2();
    List<Person> getPersonCardInfo3();

    List<Person> getPersonAddress();
    List<Person> getPersonAddress2();


    List<Person> getPersonScore();
    List<Person> getPersonScore2();

    List<Score> getScorePersonAddress();


}
