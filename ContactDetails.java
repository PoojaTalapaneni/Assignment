package Sanju;

public class ContactDetails {
	
	//@Override
		/*public String toString() {
			return "ContactDetails [houseNumber=" + houseNumber + ", localityName=" + localityName + ", cityName="
					+ cityName + ", stateName=" + stateName + ", countryName=" + countryName + ", pincode=" + pincode
					+ ", mobilenumber=" + mobilenumber + ", emailId=" + emailId + "]";
		}*/

		
			// TODO Auto-generated constructor stub
		

		private String houseNumber;
		private String localityName;
		private String cityName;
		private String stateName;
		private String countryName;
		private long pincode;
		private long mobilenumber;
		private String emailId;

		public ContactDetails(String houseNumber, String localityName, String cityName, String stateName,
				String countryName, long pincode, long mobilenumber, String emailId) {
			super();
			this.houseNumber = houseNumber;
			this.localityName = localityName;
			this.cityName = cityName;
			this.stateName = stateName;
			this.countryName = countryName;
			this.pincode = pincode;
			this.mobilenumber = mobilenumber;
			this.emailId = emailId;
		}

		public ContactDetails(String houseNumber2, String cityName, String stateName, String countryName, long pinCode2,
				String emailId, long mobileNumber) {
			// TODO Auto-generated constructor stub
		}

	
			// TODO Auto-generated constructor stub
		

		public String getHouseNumber() {
			return houseNumber;
		}

		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}

		public String getLocalityName() {
			return localityName;
		}

		public void setLocalityName(String localityName) {
			this.localityName = localityName;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getStateName() {
			return stateName;
		}

		public void setStateName(String stateName) {
			this.stateName = stateName;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}

		public long getMobilenumber() {
			return mobilenumber;
		}

		public void setMobilenumber(long mobilenumber) {
			this.mobilenumber = mobilenumber;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String eID) {
			this.emailId = eID;
		}

	}	
