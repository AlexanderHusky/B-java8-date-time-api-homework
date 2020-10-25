package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static void main(String[] args) {
      LocalDateTime date = LocalDateTime.now();
      LocalDateTime laodongjie = LocalDateTime.of(2021, 5,1,0,0);

      long days = getDaysBetweenNextLaborDay(date, laodongjie);
      System.out.println(days);
      System.out.println(date);
      System.out.println(laodongjie);
  }

  // 用对象表示时间

  public static long getDaysBetweenNextLaborDay(LocalDateTime date, LocalDateTime laodongjie) {
    Period period = Period.between(LocalDate.from(laodongjie), LocalDate.from(date));
    return period.getDays();
  }
}
