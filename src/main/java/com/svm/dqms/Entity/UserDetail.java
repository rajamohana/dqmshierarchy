package com.svm.dqms.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "userdetail")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class UserDetail implements Serializable{
	
	@JsonProperty(value="username")
		@Column(name = "username")
		private String username;
		
//	@JsonProperty(value="password")
		@Column(name = "password")
		private String password;
		
//	@JsonProperty(value="jwttoken")
		@Column(name = "jwttoken")
		private String jwttoken;
		
	@JsonProperty(value="usertype")
		@Column(name = "usertype")
		private String usertype;
		
	@JsonProperty(value="company_name")
		@Column(name = "company_name")
		private String company_name;
		
	@JsonProperty(value="email")
		@Column(name="email")
		private String email;
		
	@JsonProperty(value="preferredLanguage")
		@Column(name="preferred_language")
		private String preferredLanguage;
		
	@JsonProperty(value="nationality")
		@Column(name="nationality")
		private String nationality;
		
		@Id
		@Column(name="loginid")
		@JsonProperty(value="loginid")
		private String loginid;
		

		
		@JsonProperty(value="flag")
		@Column(name = "flag")
		private boolean flag;
		
		@JsonProperty(value="status")
		@Column(name = "status")
		private String status;
		
		
		@JsonProperty(value="fleetcode")
		@Column(name = "fleetcode")
		private String fleetcode;
	
		
		@JsonProperty(value="fleetname")
		@Column(name = "fleetname")
		private String fleetname;
	/*	public UserDetail(String username, String password, String jwttoken, String usertype, String company_name,String status) {
			super();
		
			this.username = username;
			this.password = password;
			this.jwttoken = jwttoken;
			this.usertype = usertype;
			this.company_name = company_name;
			this.status = status;
		}*/

		public UserDetail() {
		
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getJwttoken() {
			return jwttoken;
		}

		public void setJwttoken(String jwttoken) {
			this.jwttoken = jwttoken;
		}

		public String getUsertype() {
			return usertype;
		}

		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}

		public String getCompany_name() {
			return company_name;
		}

		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}

		public String getPreferredLanguage() {
			return preferredLanguage;
		}

		public void setPreferredLanguage(String preferredLanguage) {
			this.preferredLanguage = preferredLanguage;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getLoginid() {
			return loginid;
		}

		public void setLoginid(String loginid) {
			this.loginid = loginid;
		}


		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFleetcode() {
			return fleetcode;
		}

		public void setFleetcode(String fleetcode) {
			this.fleetcode = fleetcode;
		}

		public String getFleetname() {
			return fleetname;
		}

		public void setFleetname(String fleetname) {
			this.fleetname = fleetname;
		}


		
		
		
}
