package org.artfor.app.web;

import java.sql.Date;

public class BoardDTO {
   private int work_no;
   private String work_title;
   private String work_img;   
   private String work_content;   
   private String artist_id;
   private int heart;
   private Date funding_deadline;
   private int funding_goal;
   private int funding_now;
   private int supporters;
   
   public int getWork_no() {
      return work_no;
   }
   public void setWork_no(int work_no) {
      this.work_no = work_no;
   }
   public String getWork_title() {
      return work_title;
   }
   public void setWork_title(String work_title) {
      this.work_title = work_title;
   }
   public String getWork_img() {
      return work_img;
   }
   public void setWork_img(String work_img) {
      this.work_img = work_img;
   }
   public String getWork_content() {
      return work_content;
   }
   public void setWork_content(String work_content) {
      this.work_content = work_content;
   }
   public String getArtist_id() {
      return artist_id;
   }
   public void setArtist_id(String artist_id) {
      this.artist_id = artist_id;
   }
   public int getHeart() {
      return heart;
   }
   public void setHeart(int heart) {
      this.heart = heart;
   }
   public Date getFunding_deadline() {
      return funding_deadline;
   }
   public void setFunding_deadline(Date funding_deadline) {
      this.funding_deadline = funding_deadline;
   }
   public int getFunding_goal() {
      return funding_goal;
   }
   public void setFunding_goal(int funding_goal) {
      this.funding_goal = funding_goal;
   }
   public int getFunding_now() {
      return funding_now;
   }
   public void setFunding_now(int funding_now) {
      this.funding_now = funding_now;
   }
   public int getSupporters() {
      return supporters;
   }
   public void setSupporters(int supporters) {
      this.supporters = supporters;
   }
   
   public BoardDTO() {
      
   }
   
   @Override
   public String toString() {
      return "BoardDTO [work_no=" + work_no + ", work_title=" + work_title + ", work_img=" + work_img
            + ", work_content=" + work_content + ", artist_id=" + artist_id + ", heart=" + heart
            + ", funding_deadline=" + funding_deadline + ", funding_goal=" + funding_goal + ", funding_now="
            + funding_now + ", supporters=" + supporters + "]";
   }
   
}