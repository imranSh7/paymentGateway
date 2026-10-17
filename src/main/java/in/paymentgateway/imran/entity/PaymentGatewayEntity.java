package in.paymentgateway.imran.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paymentgatewaytransactions")
public class PaymentGatewayEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long gatewayTransactionId;

	private Double amount;

	private String paymentMethod;

	private String status;

	private String transactionId;

	private String gatewayReferenceId;

	private LocalDateTime transactionTime;

	public Long getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(Long gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getGatewayReferenceId() {
		return gatewayReferenceId;
	}

	public void setGatewayReferenceId(String gatewayReferenceId) {
		this.gatewayReferenceId = gatewayReferenceId;
	}

	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}

}
