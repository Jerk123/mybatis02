package net.wanho.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Score {
    private Integer scId;
    private String  scName;
    private List<Person> personList;
}
