package com.yahoo.ycsb.workloads.onlineshop;

import com.yahoo.ycsb.Status;

/**
 * Created by Friedrich on 08.08.2016.
 */
public class Recommendation extends Status {

  private int stars;

  public Recommendation(String name, String description, int stars) {
    super(name, description);
    this.stars = stars;
  }

  public int getStars() {
    return stars;
  }

}
