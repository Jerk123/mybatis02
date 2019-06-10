package net.wanho.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Person {

    private Integer pid;
    private String pname;
    private Integer cid;
    private Card card;
    private List<Address> addresses;
    private List<Score> scores;



}
