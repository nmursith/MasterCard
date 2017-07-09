package com.virtusa.mastercard.resource;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.mastercard.model.PaymentRequest;
import com.virtusa.mastercard.model.PaymentResponse;
import com.virtusa.mastercard.service.PaymentService;


@RestController("/payment") //swagger tag
public class PaymentResource {

	
	@RequestMapping(method = RequestMethod.POST, value = "/payment/create")
	public PaymentResponse create (@RequestBody PaymentRequest paymentRequest) {

		try {		
			PaymentResponse paymentResponse = new PaymentService().createPayment(paymentRequest);
			return  paymentResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PaymentResponse paymentResponse = new PaymentResponse();
			paymentResponse.setError(e.getMessage());
			return paymentResponse;
		}
	}
}
