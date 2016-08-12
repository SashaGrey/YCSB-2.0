package com.yahoo.ycsb.workloads.onlineshop;

import com.yahoo.ycsb.Status;


public class Recommendation extends Status {

  private int stars;
  private String bookTitle;
  private int  count;
  private int bookID;

  //object constructor
  public Recommendation(String name, String description, int stars,String bookTitle) {
    super(name, description);
    this.stars = stars;
    this.bookTitle = bookTitle;
  }
// bundel constructor
  public Recommendation(String name, String description, String bookTitle, int count) {
    super(name, description);
    this.count = count;
    this.bookTitle = bookTitle;
  }
// set recommendations fo a book
  public Recommendation(String name, String description, int bookID,int stars) {
    super(name, description);
    this.bookID = bookID;
    this.stars = stars;
  }


  public String getBookTitle() {
    return bookTitle;
  }

  public int getBookID() {
    return bookID;
  }

  public int getStars() {
    return stars;
  }

  public int getCount() {
    return count;
  }
}
