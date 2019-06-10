package com.example.demo62.pojo;

import java.io.Serializable;

/**
 * static_user_role
 *
 * @author
 */
public class StaticUserRole implements Serializable {

    public StaticUserRole() {

    }

    public StaticUserRole(String userId, String roleId, String userRoleNote) {
        this.userId = userId;
        this.roleId = roleId;
        this.userRoleNote = userRoleNote;
    }

    public StaticUserRole(Integer userRoleId, String userId, String roleId, String userRoleNote) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.roleId = roleId;
        this.userRoleNote = userRoleNote;
    }

    private Integer userRoleId;

    private String userId;

    private String roleId;

    private String userRoleNote;

    private static final long serialVersionUID = 1L;

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserRoleNote() {
        return userRoleNote;
    }

    public void setUserRoleNote(String userRoleNote) {
        this.userRoleNote = userRoleNote;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StaticUserRole other = (StaticUserRole) that;
        return (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getUserRoleNote() == null ? other.getUserRoleNote() == null : this.getUserRoleNote().equals(other.getUserRoleNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserRoleNote() == null) ? 0 : getUserRoleNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", userRoleNote=").append(userRoleNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}