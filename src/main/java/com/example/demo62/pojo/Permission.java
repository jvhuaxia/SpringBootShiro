package com.example.demo62.pojo;

import java.util.List;
import java.util.StringJoiner;

public class Permission {
    private String id;
    private String name;
    private List<String> uri;
    private String note;

    public Permission() {

    }

    public Permission(String id, String name, List<String> uri, String note) {
        this.id = id;
        this.name = name;
        this.uri = uri;
        this.note = note;
    }

    public Permission(String name, List<String> uri, String note) {
        this.name = name;
        this.uri = uri;
        this.note = note;
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

    public List<String> getUri() {
        return uri;
    }

    public void setUri(List<String> uri) {
        this.uri = uri;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Permission.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("uri='" + uri + "'")
                .add("note='" + note + "'")
                .toString();
    }
}
