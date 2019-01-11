package com.example.wishlistwebservice.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Groups")
@EntityListeners(AuditingEntityListener.class)
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long group_id;
    @NotBlank
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "groups_user",
            joinColumns =  @JoinColumn(name = "group_id", referencedColumnName ="group_id" ) ,
            inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id") )
    private List<User> user;

    public Group(){

    }

    public Group(String name) {
        this.name = name;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
