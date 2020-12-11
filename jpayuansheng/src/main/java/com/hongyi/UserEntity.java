package com.hongyi;

import javax.persistence.*;

/**
 * @author User
 * @date 2020/12/10 11:14
 */
//需要在左侧persistence中指定数据库，否则有红线。
//需要提供无参构造，否则有红线
@Entity
@Table(name="USER_TABLE")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public int id;
    @Column(name = "user_name")
    public String name;
    @Column(name = "user_age")
    public int age ;

    public UserEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
