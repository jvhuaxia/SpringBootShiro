package com.example.demo62.pojo;


import java.util.List;

public class User {

    private String id;
    private String name;
    private String password;
    private String lastSignTime;
    private int signState;
    private String tickeId;
    private List<Role> roles;

    public User(String id, String name, String password, String lastSignTime, int signState,
                String tickeId, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.lastSignTime = lastSignTime;
        this.signState = signState;
        this.tickeId = tickeId;
        this.roles = roles;
    }

    public User(String name, String password, String lastSignTime, int signState, String tickeId,
                List<Role> roles) {
        this.name = name;
        this.password = password;
        this.lastSignTime = lastSignTime;
        this.signState = signState;
        this.tickeId = tickeId;
        this.roles = roles;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastSignTime() {
        return lastSignTime;
    }

    public void setLastSignTime(String lastSignTime) {
        this.lastSignTime = lastSignTime;
    }

    public int getSignState() {
        return signState;
    }

    public void setSignState(int signState) {
        this.signState = signState;
    }

    public String getTickeId() {
        return tickeId;
    }

    public void setTickeId(String tickeId) {
        this.tickeId = tickeId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


}
