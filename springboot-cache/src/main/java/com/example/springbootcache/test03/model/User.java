package com.example.springbootcache.test03.model;

import java.io.Serializable;

/**
*User
* @author Shein Generator
* @since 2019/10/20
*/
public class User implements Serializable {
    /**
    *id
    */
    private Long id;

    /**
    *name
    */
    private String name;

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
    * getName
    * @return String String
    */
    public String getName() {
        return name;
    }

    /**
    * setName
    * @param name name
    */
    public void setName(String name) {
        this.name = name;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}