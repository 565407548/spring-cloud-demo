package com.zcj.servicehi;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @description:
 * @author: Zheng Jim
 * @date: 18-11-30 上午9:56
 */
public class User {
    private long id;
    private String name;
    private String avatar;
    private List<String> phoneList;

//    public User(long id, String name, String avatar) {
//        this.id = id;
//        this.name = name;
//        this.avatar = avatar;
//    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public static User obtain(){
        User user= new User();
        user.setId(0L);
        user.setName("");
        user.setAvatar("");
        user.setPhoneList(Lists.newArrayList());
        return user;

    }
}
