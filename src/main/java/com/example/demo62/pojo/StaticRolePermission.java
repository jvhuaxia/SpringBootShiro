package com.example.demo62.pojo;

import java.io.Serializable;

/**
 * static_role_permission
 *
 * @author
 */
public class StaticRolePermission implements Serializable {
    public StaticRolePermission() {

    }

    public StaticRolePermission(String roleId, String permissionId, String rolePermissionNote) {
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.rolePermissionNote = rolePermissionNote;
    }


    public StaticRolePermission(Integer rolePermissionId, String roleId, String permissionId, String rolePermissionNote) {
        this.rolePermissionId = rolePermissionId;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.rolePermissionNote = rolePermissionNote;
    }


    private Integer rolePermissionId;

    private String roleId;

    private String permissionId;

    private String rolePermissionNote;

    private static final long serialVersionUID = 1L;


    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getRolePermissionNote() {
        return rolePermissionNote;
    }

    public void setRolePermissionNote(String rolePermissionNote) {
        this.rolePermissionNote = rolePermissionNote;
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
        StaticRolePermission other = (StaticRolePermission) that;
        return (this.getRolePermissionId() == null ? other.getRolePermissionId() == null : this.getRolePermissionId().equals(other.getRolePermissionId()))
                && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
                && (this.getRolePermissionNote() == null ? other.getRolePermissionNote() == null : this.getRolePermissionNote().equals(other.getRolePermissionNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRolePermissionId() == null) ? 0 : getRolePermissionId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getRolePermissionNote() == null) ? 0 : getRolePermissionNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePermissionId=").append(rolePermissionId);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", rolePermissionNote=").append(rolePermissionNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}