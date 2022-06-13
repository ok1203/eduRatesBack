package com.example.edurates.staff;

import com.example.edurates.schools.School;

import javax.persistence.*;

@Entity
@Table(name = " staff")
public class Staff {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45, name = "name")
    private String name;

    @Column(nullable = false, length = 45, name = "position")
    private String position;

    @Column(nullable = false, name = "rating")
    private Integer rating;

    @Column(nullable = false, name = "experience")
    private Integer experience;

    @Column(nullable = false, length = 45, name = "subject")
    private String subject;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", rating=" + rating +
                ", experience=" + experience +
                ", subject='" + subject + '\'' +
                ", school=" + school +
                '}';
    }
}
