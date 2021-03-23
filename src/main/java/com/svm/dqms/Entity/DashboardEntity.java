package com.svm.dqms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Import1")
public class DashboardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int ID;

	@Column(name = "IMO_NO")
	private int IMO_NO;

	@Column(name = "VESSEL_NAME")
	private String VESSEL_NAME;

	@Column(name = "ShipManagement")
	private String ShipManagement;

	@Column(name = "UTC_DATE")
	private String UTC_DATE;
	
	

	public int getIMO_NO() {
		return IMO_NO;
	}

	public void setIMO_NO(int iMO_NO) {
		IMO_NO = iMO_NO;
	}

	public String getVESSEL_NAME() {
		return VESSEL_NAME;
	}

	public void setVESSEL_NAME(String vESSEL_NAME) {
		VESSEL_NAME = vESSEL_NAME;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getShipManagement() {
		return ShipManagement;
	}

	public void setShipManagement(String shipManagement) {
		ShipManagement = shipManagement;
	}

	public String getUTC_DATE() {
		return UTC_DATE;
	}

	public void setUTC_DATE(String uTC_DATE) {
		UTC_DATE = uTC_DATE;
	}

	@Override
	public String toString() {
		return "DashboardEntity [ID=" + ID + ", IMO_NO=" + IMO_NO + ", VESSEL_NAME=" + VESSEL_NAME + ", ShipManagement="
				+ ShipManagement + ", UTC_DATE=" + UTC_DATE + "]";
	}
	
}
