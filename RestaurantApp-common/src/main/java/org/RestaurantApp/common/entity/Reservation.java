package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/****

@author Komal
 *
 */

 @Entity
 @Table(name = "reservation")
 public class Reservation {

 @EmbeddedId
 private ReservationId reservationId;

 public Reservation() {
 reservationId = new ReservationId();
 }

 @Column(name = "count")
 private int count;

 public ReservationId getReservationId() {
 return reservationId;
 }

 public void setReservationId(ReservationId reservationId) {
 this.reservationId = reservationId;
 }

 public int getCount() {
 return count;
 }

 public void setCount(int count) {
 this.count = count;
 }

 }
