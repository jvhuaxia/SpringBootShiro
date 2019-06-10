package com.example.demo62.pojo;

import java.util.List;
import java.util.StringJoiner;

public class Role {

    private String id;
    private String name;
    private String note;
    private List<Permission> permissions;
    private List<User> users;

    public Role() {
    }

    public Role(String id, String name, String note,
                List<Permission> permissions, List<User> users) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.permissions = permissions;
        this.users = users;
    }

    public Role(String name, String note,
                List<Permission> permissions, List<User> users) {
        this.name = name;
        this.note = note;
        this.permissions = permissions;
        this.users = users;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Role.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("note='" + note + "'")
                .add("permissions=" + permissions)
                .add("users=" + users.size())
                .toString();
    }
}
