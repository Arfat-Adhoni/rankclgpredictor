package com.rankclgpredictor.firstversion.model;

import jakarta.persistence.*;

@Entity
@Table(name  = "eng_2024_gen")
public class Eng2025Gen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    @Column(name = "Clg_Code")
    private String clgCode;

    @Column(name = "Branch")
    private String branch;

    @Column(name = "1H") private Long oneH;
    @Column(name = "1KH") private Long oneKH;
    @Column(name = "1RH") private Long oneRH;
    @Column(name = "2AH") private Long twoAH;
    @Column(name = "2AKH") private Long twoAKH;
    @Column(name = "2ARH") private Long twoARH;
    @Column(name = "2BH") private Long twoBH;
    @Column(name = "2BKH") private Long twoBKH;
    @Column(name = "2BRH") private Long twoBRH;
    @Column(name = "3AH") private Long threeAH;
    @Column(name = "3AKH") private Long threeAKH;
    @Column(name = "3ARH") private Long threeARH;
    @Column(name = "3BH") private Long threeBH;
    @Column(name = "3BKH") private Long threeBKH;
    @Column(name = "3BRH") private Long threeBRH;
    @Column(name = "GMH") private Long gmh;
    @Column(name = "GMKH") private Long gmkh;
    @Column(name = "GMRH") private Long gmrh;
    @Column(name = "SCH") private Long sch;
    @Column(name = "SCKH") private Long sckh;
    @Column(name = "SCRH") private Long scrh;
    @Column(name = "STH") private Long sth;
    @Column(name = "STKH") private Long stkh;
    @Column(name = "STRH") private Long strh;

    // Getters and Setters

    public Long getSlNo() {
        return slNo;
    }

    public void setSlNo(Long slNo) {
        this.slNo = slNo;
    }

    public String getClgCode() {
        return clgCode;
    }

    public void setClgCode(String clgCode) {
        this.clgCode = clgCode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Long getOneH() {
        return oneH;
    }

    public void setOneH(Long oneH) {
        this.oneH = oneH;
    }

    public Long getOneKH() {
        return oneKH;
    }

    public void setOneKH(Long oneKH) {
        this.oneKH = oneKH;
    }

    public Long getOneRH() {
        return oneRH;
    }

    public void setOneRH(Long oneRH) {
        this.oneRH = oneRH;
    }

    public Long getTwoAH() {
        return twoAH;
    }

    public void setTwoAH(Long twoAH) {
        this.twoAH = twoAH;
    }

    public Long getTwoAKH() {
        return twoAKH;
    }

    public void setTwoAKH(Long twoAKH) {
        this.twoAKH = twoAKH;
    }

    public Long getTwoARH() {
        return twoARH;
    }

    public void setTwoARH(Long twoARH) {
        this.twoARH = twoARH;
    }

    public Long getTwoBH() {
        return twoBH;
    }

    public void setTwoBH(Long twoBH) {
        this.twoBH = twoBH;
    }

    public Long getTwoBKH() {
        return twoBKH;
    }

    public void setTwoBKH(Long twoBKH) {
        this.twoBKH = twoBKH;
    }

    public Long getTwoBRH() {
        return twoBRH;
    }

    public void setTwoBRH(Long twoBRH) {
        this.twoBRH = twoBRH;
    }

    public Long getThreeAH() {
        return threeAH;
    }

    public void setThreeAH(Long threeAH) {
        this.threeAH = threeAH;
    }

    public Long getThreeAKH() {
        return threeAKH;
    }

    public void setThreeAKH(Long threeAKH) {
        this.threeAKH = threeAKH;
    }

    public Long getThreeARH() {
        return threeARH;
    }

    public void setThreeARH(Long threeARH) {
        this.threeARH = threeARH;
    }

    public Long getThreeBH() {
        return threeBH;
    }

    public void setThreeBH(Long threeBH) {
        this.threeBH = threeBH;
    }

    public Long getThreeBKH() {
        return threeBKH;
    }

    public void setThreeBKH(Long threeBKH) {
        this.threeBKH = threeBKH;
    }

    public Long getThreeBRH() {
        return threeBRH;
    }

    public void setThreeBRH(Long threeBRH) {
        this.threeBRH = threeBRH;
    }

    public Long getGmh() {
        return gmh;
    }

    public void setGmh(Long gmh) {
        this.gmh = gmh;
    }

    public Long getGmkh() {
        return gmkh;
    }

    public void setGmkh(Long gmkh) {
        this.gmkh = gmkh;
    }

    public Long getGmrh() {
        return gmrh;
    }

    public void setGmrh(Long gmrh) {
        this.gmrh = gmrh;
    }

    public Long getSch() {
        return sch;
    }

    public void setSch(Long sch) {
        this.sch = sch;
    }

    public Long getSckh() {
        return sckh;
    }

    public void setSckh(Long sckh) {
        this.sckh = sckh;
    }

    public Long getScrh() {
        return scrh;
    }

    public void setScrh(Long scrh) {
        this.scrh = scrh;
    }

    public Long getSth() {
        return sth;
    }

    public void setSth(Long sth) {
        this.sth = sth;
    }

    public Long getStkh() {
        return stkh;
    }

    public void setStkh(Long stkh) {
        this.stkh = stkh;
    }

    public Long getStrh() {
        return strh;
    }

    public void setStrh(Long strh) {
        this.strh = strh;
    }
}
