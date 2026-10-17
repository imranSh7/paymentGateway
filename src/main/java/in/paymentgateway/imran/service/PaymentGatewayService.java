package in.paymentgateway.imran.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.paymentgateway.imran.entity.PaymentGatewayEntity;
import in.paymentgateway.imran.model.PaymentGatewayRequest;
import in.paymentgateway.imran.model.PaymentGatewayResponse;
import in.paymentgateway.imran.repository.PaymentGatewayRepository;

@Service
public class PaymentGatewayService {
	
	private final PaymentGatewayRepository paymentGatewayRepository;

	public PaymentGatewayService(PaymentGatewayRepository paymentGatewayRepository) {
		this.paymentGatewayRepository = paymentGatewayRepository;
	}
	public PaymentGatewayResponse pay(PaymentGatewayRequest gatewayRequest) {
		
		PaymentGatewayEntity paymentGateway = new PaymentGatewayEntity();

//		payment.setOrderId(request.getOrderId());
		paymentGateway.setStatus("SUCCESS");
		paymentGateway.setTransactionTime(LocalDateTime.now());
		paymentGateway.setAmount(gatewayRequest.getAmount());
		paymentGateway.setPaymentMethod(gatewayRequest.getPaymentMethod());
		paymentGateway.setStatus("SUCCESS");

		paymentGateway.setTransactionId(UUID.randomUUID().toString());
		paymentGateway.setGatewayReferenceId(UUID.randomUUID().toString());
		
		
		PaymentGatewayEntity savedPaymentGateway = paymentGatewayRepository.save(paymentGateway);


		PaymentGatewayResponse gatewayResponse = new PaymentGatewayResponse();

		gatewayResponse.setStatus("SUCCESS");
		

		gatewayResponse.setTransactionId(
                UUID.randomUUID().toString());

		gatewayResponse.setMessage("Payment Successful");
		

        return gatewayResponse;

}
	
}

	

	
