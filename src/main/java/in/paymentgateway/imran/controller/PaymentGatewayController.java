package in.paymentgateway.imran.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.paymentgateway.imran.model.PaymentGatewayRequest;
import in.paymentgateway.imran.model.PaymentGatewayResponse;
import in.paymentgateway.imran.service.PaymentGatewayService;

@RestController
@RequestMapping("/gateway")
public class PaymentGatewayController {
	
	private final PaymentGatewayService gatewayService;

	public PaymentGatewayController(PaymentGatewayService gatewayService) {
		this.gatewayService = gatewayService;
	}

	@PostMapping("/pay")
    public PaymentGatewayResponse pay(@RequestBody PaymentGatewayRequest gatewayRequest) {
		
		return gatewayService.pay(gatewayRequest);

		
		
	}

}
