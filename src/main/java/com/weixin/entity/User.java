package com.weixin.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;

@Data
public class User implements Serializable{
public String name;
private String email;
private int age;

}
