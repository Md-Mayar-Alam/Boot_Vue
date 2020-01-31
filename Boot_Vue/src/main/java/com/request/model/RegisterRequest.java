package com.request.model;

public class RegisterRequest {

	private String firstName;
	private String lastName;
	private String email;
	private String confirmEmail;
	private String phoneNo;
	private String password;
	private String confirmPassword;
	private boolean enrollInNapaRewards;
	private String languagePreference;
	private boolean receivePromotionEmails;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isEnrollInNapaRewards() {
		return enrollInNapaRewards;
	}
	public void setEnrollInNapaRewards(boolean enrollInNapaRewards) {
		this.enrollInNapaRewards = enrollInNapaRewards;
	}
	public String getLanguagePreference() {
		return languagePreference;
	}
	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}
	public boolean isReceivePromotionEmails() {
		return receivePromotionEmails;
	}
	public void setReceivePromotionEmails(boolean receivePromotionEmails) {
		this.receivePromotionEmails = receivePromotionEmails;
	}
}
