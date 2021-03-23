package com.svm.dqms.Entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name = "Import1")
	public class CompletenessEntity {	

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
		
		@Column(name = "Col8")
		private String MERev;
		
		@Column(name = "Col6")
		private String MELoad;
		
		@Column(name = "Col231")
		private String MENo1CycExhGasOut;
		
		@Column(name = "Col89")
		private String MEScavAirPressure;
		
		@Column(name = "LAT_START")
		private String LAT_START;
		
		@Column(name = "RELATIVE_WIND_DIRECTION")
		private String RELATIVE_WIND_DIRECTION;
		
		@Column(name = "RELATIVE_WIND")
		private String RELATIVE_WIND;
		

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

		
		
		public String getMERev() {
			return MERev;
		}

		public void setMERev(String mERev) {
			MERev = mERev;
		}

		public String getMELoad() {
			return MELoad;
		}

		public void setMELoad(String mELoad) {
			MELoad = mELoad;
		}

		public String getMENo1CycExhGasOut() {
			return MENo1CycExhGasOut;
		}

		public void setMENo1CycExhGasOut(String mENo1CycExhGasOut) {
			MENo1CycExhGasOut = mENo1CycExhGasOut;
		}

		public String getMEScavAirPressure() {
			return MEScavAirPressure;
		}

		public void setMEScavAirPressure(String mEScavAirPressure) {
			MEScavAirPressure = mEScavAirPressure;
		}
		
		

		public String getLAT_START() {
			return LAT_START;
		}

		public void setLAT_START(String lAT_START) {
			LAT_START = lAT_START;
		}

		public String getRELATIVE_WIND_DIRECTION() {
			return RELATIVE_WIND_DIRECTION;
		}

		public void setRELATIVE_WIND_DIRECTION(String rELATIVE_WIND_DIRECTION) {
			RELATIVE_WIND_DIRECTION = rELATIVE_WIND_DIRECTION;
		}

		public String getRELATIVE_WIND() {
			return RELATIVE_WIND;
		}

		public void setRELATIVE_WIND(String rELATIVE_WIND) {
			RELATIVE_WIND = rELATIVE_WIND;
		}

		@Override
		public String toString() {
			return "CompletenessEntity [ID=" + ID + ", IMO_NO=" + IMO_NO + ", VESSEL_NAME=" + VESSEL_NAME
					+ ", ShipManagement=" + ShipManagement + ", UTC_DATE=" + UTC_DATE + ", MERev=" + MERev + ", MELoad="
					+ MELoad + ", MENo1CycExhGasOut=" + MENo1CycExhGasOut + ", MEScavAirPressure=" + MEScavAirPressure
					+ ", LAT_START=" + LAT_START + ", RELATIVE_WIND_DIRECTION=" + RELATIVE_WIND_DIRECTION
					+ ", RELATIVE_WIND=" + RELATIVE_WIND + "]";
		}
		
	}




