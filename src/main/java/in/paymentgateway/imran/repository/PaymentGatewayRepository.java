package in.paymentgateway.imran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.paymentgateway.imran.entity.PaymentGatewayEntity;

public interface PaymentGatewayRepository extends JpaRepository<PaymentGatewayEntity, Long> {

}
