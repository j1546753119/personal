package com.example.springbootcache.test03.model;

import java.io.Serializable;

/**
*UserRel
* @author Shein Generator
* @since 2019/10/21
*/
public class UserRel implements Serializable {
    /**
    *id
    */
    private Long id;

    /**
    *userId
    */
    private Long userId;

    /**
    *serialVersionUID
    */
    private static final long serialVersionUID = 1L;

    /**
    * getId
    * @return Long Long
    */
    public Long getId() {
        return id;
    }

    /**
    * setId
    * @param id id
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * getUserId
    * @return Long Long
    */
    public Long getUserId() {
        return userId;
    }

    /**
    * setUserId
    * @param userId userId
    */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
    * equals
    * @param that that
    * @return boolean boolean
    */
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
        UserRel other = (UserRel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
    * hashCode
    * @return int int
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
    * toString
    * @return String String
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}