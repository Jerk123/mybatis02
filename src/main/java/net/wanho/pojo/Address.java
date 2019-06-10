package net.wanho.pojo;

import lombok.Data;

@Data
public class Address {

    private Integer aid;
    private String aname;
    private Integer pid;
    private Person person;
}
