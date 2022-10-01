package Sanju;

public class kycVerification {
	private String panNumber;
	private long adhaarNumber;
	private String documentType;
	private String documentNumber;

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

/*	@Override
	public String toString() {
		return "KycVerification [panNumber=" + panNumber + ", adhaarNumber=" + adhaarNumber + ", documentType="
				+ documentType + ", documentNumber=" + documentNumber + "]";
	}*/

	public kycVerification (String panNumber, long adhaarNumber, String documentType,String documentNumber) {
		super();
		// TODO Auto-generated constructor stub
	

			this.panNumber = panNumber;
		this.adhaarNumber = adhaarNumber;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}
