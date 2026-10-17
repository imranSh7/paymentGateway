package in.paymentgateway.imran.model;

public class PaymentGatewayResponse {

	private String status;
	private String transactionId;
	private String message;

	public PaymentGatewayResponse(String status, String transactionId, String message) {
		super();
		this.status = status;
		this.transactionId = transactionId;
		this.message = message;
	}

	public PaymentGatewayResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactonId) {
		this.transactionId = transactonId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
