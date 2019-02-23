package com.tat.springangular.model.response;

import java.time.LocalDate;

public class ReservationResponse {

	private Long Id;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public ReservationResponse(Long id, LocalDate checkin, LocalDate checkout) {
		super();
		Id = id;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public ReservationResponse() {
		super();
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public LocalDate getCheckin() {
		return checkin;
	}
	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}
	public LocalDate getCheckout() {
		return checkout;
	}
	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
	
	
}
