package com.example.edurates.schools;

import javax.persistence.*;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45, name = "name")
    private String name;

    @Column(nullable = false, length = 45, name = "type")
    private String type;

    @Column(nullable = false, length = 45, name = "address")
    private String address;

    @Column(nullable = false, length = 45, name = "region")
    private String region;

    @Column(nullable = false, length = 45, name = "district")
    private String district;

    @Column(nullable = false, length = 45, name = "language")
    private String language;

    @Column(nullable = false, name = "rating_1")
    private Integer rating1;

    @Column(nullable = false, name = "rating_2")
    private Integer rating2;

    @Column(nullable = false, name = "rating_3")
    private Integer rating3;

    @Column(nullable = false, name = "rating_4")
    private Integer rating4;

    @Column(nullable = false, name = "rating_5")
    private Integer rating5;

    @Column(nullable = false, length = 250, name = "img_url")
    private String imgUrl;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getRating1() {
        return rating1;
    }

    public void setRating1(Integer rating1) {
        this.rating1 = rating1;
    }

    public Integer getRating2() {
        return rating2;
    }

    public void setRating2(Integer rating2) {
        this.rating2 = rating2;
    }

    public Integer getRating3() {
        return rating3;
    }

    public void setRating3(Integer rating3) {
        this.rating3 = rating3;
    }

    public Integer getRating4() {
        return rating4;
    }

    public void setRating4(Integer rating4) {
        this.rating4 = rating4;
    }

    public Integer getRating5() {
        return rating5;
    }

    public void setRating5(Integer rating5) {
        this.rating5 = rating5;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", language='" + language + '\'' +
                ", rating1=" + rating1 +
                ", rating2=" + rating2 +
                ", rating3=" + rating3 +
                ", rating4=" + rating4 +
                ", rating5=" + rating5 +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
