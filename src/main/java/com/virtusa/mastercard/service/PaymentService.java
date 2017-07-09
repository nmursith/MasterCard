package com.virtusa.mastercard.service;

import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.exception.*;
import com.mastercard.api.core.model.*;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;
import com.mastercard.api.moneysend.*;
import com.virtusa.mastercard.model.PaymentResponse;
import com.virtusa.mastercard.model.PaymentRequest;

import java.io.*;
import java.security.*;
import java.security.cert.CertificateException;

public class PaymentService {

	public PaymentResponse createPayment(PaymentRequest paymentRequest) throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, ApiException{
		String consumerKey = "cb3D8Xmu1zbYlbLZomUwK2EtVAhrS7krboyCtM7ea892a79d!3a3d4755ad0b4211b509a6799b6e4de60000000000000000";   // You should copy this from "My Keys" on your project page e.g. UTfbhDCSeNYvJpLL5l028sWL9it739PYh6LU5lZja15xcRpY!fd209e6c579dc9d7be52da93d35ae6b6c167c174690b72fa
        String keyAlias = "keyalias";   // For production: change this to the key alias you chose when you created your production key
        String keyPassword = "keystorepassword";   // For production: change this to the key alias you chose when you created your production key
        
        InputStream is = getClass().getClassLoader().getResourceAsStream("Test_sandbox.p12");//new FileInputStream("/src/Test_sandbox.p12"); // e.g. /Users/yourname/project/sandbox.p12 | C:\Users\yourname\project\sandbox.p12
        System.out.println("Stream: "+ is);
        

        ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, is, keyAlias, keyPassword));   // You only need to set this once
        ApiConfig.setSandbox(true);     // For production: use ApiConfig.setSandbox(false);

        
        RequestMap map = new RequestMap();
//        map.set("PaymentRequestV3.LocalDate", paymentRequest.getLocalDate());
//        map.set("PaymentRequestV3.LocalTime", paymentRequest.getLocalTime());
//        map.set("PaymentRequestV3.TransactionReference", paymentRequest.getTransactionReference());
//        map.set("PaymentRequestV3.SenderName.First", paymentRequest.getSenderName_First());
//        map.set("PaymentRequestV3.SenderName.Middle", paymentRequest.getSenderName_Middle());
//        map.set("PaymentRequestV3.SenderName.Last", paymentRequest.getSenderName_Last());
//        map.set("PaymentRequestV3.SenderPhone", paymentRequest.getSenderPhone());
//        map.set("PaymentRequestV3.SenderDateOfBirth", paymentRequest.getSenderDateOfBirth());
//        map.set("PaymentRequestV3.SenderAddress.Line1", paymentRequest.getSenderAddress_Line1());
//        map.set("PaymentRequestV3.SenderAddress.City", paymentRequest.getSenderAddress_City());
//        map.set("PaymentRequestV3.SenderAddress.CountrySubdivision", paymentRequest.getSenderAddress_CountrySubdivision());
//        map.set("PaymentRequestV3.SenderAddress.PostalCode", paymentRequest.getSenderAddress_PostalCode());
//        map.set("PaymentRequestV3.SenderAddress.Country", paymentRequest.getSenderAddress_Country());
//        map.set("PaymentRequestV3.FundingMapped.SubscriberId", paymentRequest.getFundingMapped_SubscriberId());-----------------------
//        map.set("PaymentRequestV3.FundingMapped.SubscriberType", paymentRequest.getFundingMapped_SubscriberType());
//        map.set("PaymentRequestV3.FundingMapped.SubscriberAlias", paymentRequest.getFundingMapped_SubscriberType());
//        map.set("PaymentRequestV3.FundingSource", paymentRequest.getFundingSource());
//        map.set("PaymentRequestV3.AdditionalMessage", paymentRequest.getAdditionalMessage());
//        map.set("PaymentRequestV3.ParticipationID", paymentRequest.getParticipationID());
//        map.set("PaymentRequestV3.LanguageIdentification", paymentRequest.getLanguageIdentification());
//        map.set("PaymentRequestV3.LanguageData", paymentRequest.getLanguageData());
//        map.set("PaymentRequestV3.ReceiverName.First", paymentRequest.getReceiverName_First());
//        map.set("PaymentRequestV3.ReceiverName.Middle", paymentRequest.getReceiverName_Middle());
//        map.set("PaymentRequestV3.ReceiverName.Last", paymentRequest.getReceiverName_Last());
//        map.set("PaymentRequestV3.ReceiverAddress.Line1", paymentRequest.getReceiverAddress_Line1());
//        map.set("PaymentRequestV3.ReceiverAddress.City", paymentRequest.getReceiverAddress_City());
//        map.set("PaymentRequestV3.ReceiverAddress.CountrySubdivision", paymentRequest.getReceiverAddress_CountrySubdivision());
//        map.set("PaymentRequestV3.ReceiverAddress.PostalCode", paymentRequest.getReceiverAddress_PostalCode());
//        map.set("PaymentRequestV3.ReceiverAddress.Country", paymentRequest.getReceiverAddress_Country());
//        map.set("PaymentRequestV3.ReceiverPhone", paymentRequest.getReceiverPhone());
//        map.set("PaymentRequestV3.ReceiverDateOfBirth", paymentRequest.getReceiverDateOfBirth());
//        map.set("PaymentRequestV3.ReceivingMapped.SubscriberId", paymentRequest.getReceivingMapped_SubscriberId());
//        map.set("PaymentRequestV3.ReceivingMapped.SubscriberType", paymentRequest.getReceivingMapped_SubscriberType());
//        map.set("PaymentRequestV3.ReceivingMapped.SubscriberAlias", paymentRequest.getReceivingMapped_SubscriberAlias());
//        map.set("PaymentRequestV3.ReceivingAmount.Value", paymentRequest.getReceivingAmount_Value());
//        map.set("PaymentRequestV3.ReceivingAmount.Currency", paymentRequest.getReceivingAmount_Currency());
//        map.set("PaymentRequestV3.Channel", paymentRequest.getChannel());
//        map.set("PaymentRequestV3.ICA", paymentRequest.getICA());
//        map.set("PaymentRequestV3.ProcessorId", paymentRequest.getProcessorId());
//        map.set("PaymentRequestV3.RoutingAndTransitNumber", paymentRequest.getRoutingAndTransitNumber());
//        map.set("PaymentRequestV3.CardAcceptor.Name", paymentRequest.getCardAcceptor_Name());
//        map.set("PaymentRequestV3.CardAcceptor.City", paymentRequest.getCardAcceptor_City());
//        map.set("PaymentRequestV3.CardAcceptor.State", paymentRequest.getCardAcceptor_State());
//        map.set("PaymentRequestV3.CardAcceptor.PostalCode", paymentRequest.getCardAcceptor_PostalCode());
//        map.set("PaymentRequestV3.CardAcceptor.Country", paymentRequest.getCardAcceptor_Country());
//        map.set("PaymentRequestV3.TransactionDesc", paymentRequest.getTransactionDesc());
//        map.set("PaymentRequestV3.MerchantId", paymentRequest.getMerchantId());
        
        
        
        //RequestMap map = new RequestMap();
        map.set("PaymentRequestV3.LocalDate", paymentRequest.getLocalDate());
        map.set("PaymentRequestV3.LocalTime", paymentRequest.getLocalTime());
        map.set("PaymentRequestV3.TransactionReference", paymentRequest.getTransactionReference());
        map.set("PaymentRequestV3.SenderName.First", paymentRequest.getSenderName_Last());
        map.set("PaymentRequestV3.SenderName.Middle", paymentRequest.getSenderName_Middle());
        map.set("PaymentRequestV3.SenderName.Last", paymentRequest.getSenderName_Last());
        map.set("PaymentRequestV3.SenderPhone", paymentRequest.getSenderPhone());
        map.set("PaymentRequestV3.SenderDateOfBirth", paymentRequest.getSenderDateOfBirth());
        map.set("PaymentRequestV3.SenderAddress.Line1", paymentRequest.getSenderAddress_Line1());
        map.set("PaymentRequestV3.SenderAddress.Line2", paymentRequest.getReceiverAddress_Line2());
        map.set("PaymentRequestV3.SenderAddress.City",paymentRequest.getSenderAddress_City());
        map.set("PaymentRequestV3.SenderAddress.CountrySubdivision", paymentRequest.getSenderAddress_CountrySubdivision());
        map.set("PaymentRequestV3.SenderAddress.PostalCode", paymentRequest.getSenderAddress_PostalCode());
        map.set("PaymentRequestV3.SenderAddress.Country", paymentRequest.getSenderAddress_Country());
        map.set("PaymentRequestV3.FundingCard.AccountNumber", paymentRequest.getFundingCard_AccountNumber());
        map.set("PaymentRequestV3.FundingSource", paymentRequest.getFundingSource());
        map.set("PaymentRequestV3.AdditionalMessage", paymentRequest.getAdditionalMessage());
        map.set("PaymentRequestV3.ParticipationId", paymentRequest.getParticipationID());
        map.set("PaymentRequestV3.LanguageIdentification", paymentRequest.getLanguageIdentification());
        map.set("PaymentRequestV3.LanguageData", paymentRequest.getLanguageData());
        map.set("PaymentRequestV3.ReceivingCard.AccountNumber", paymentRequest.getReceivingCard_AccountNumber());
        map.set("PaymentRequestV3.ReceiverName.Middle", paymentRequest.getReceiverName_Middle());
        map.set("PaymentRequestV3.ReceiverName.Last", paymentRequest.getReceiverName_Last());
        map.set("PaymentRequestV3.ReceiverAddress.Line1", paymentRequest.getReceiverAddress_Line1());
        map.set("PaymentRequestV3.ReceiverAddress.Line2", paymentRequest.getReceiverAddress_Line2());
        map.set("PaymentRequestV3.ReceiverAddress.City", paymentRequest.getReceiverAddress_City());
        map.set("PaymentRequestV3.ReceiverAddress.CountrySubdivision", paymentRequest.getReceiverAddress_CountrySubdivision());
        map.set("PaymentRequestV3.ReceiverAddress.PostalCode", paymentRequest.getReceiverAddress_PostalCode());
        map.set("PaymentRequestV3.ReceiverAddress.Country", paymentRequest.getReceiverAddress_Country());
        map.set("PaymentRequestV3.ReceiverPhone", paymentRequest.getReceiverPhone());
        map.set("PaymentRequestV3.ReceiverDateOfBirth", paymentRequest.getReceiverDateOfBirth());
        map.set("PaymentRequestV3.ReceivingAmount.Value", paymentRequest.getReceivingAmount_Value());
        map.set("PaymentRequestV3.ReceivingAmount.Currency", paymentRequest.getReceivingAmount_Currency());
        map.set("PaymentRequestV3.ICA", paymentRequest.getICA());
        map.set("PaymentRequestV3.ProcessorId", paymentRequest.getProcessorId());
        map.set("PaymentRequestV3.RoutingAndTransitNumber", paymentRequest.getRoutingAndTransitNumber());
        map.set("PaymentRequestV3.CardAcceptor.Name", paymentRequest.getCardAcceptor_Name());
        map.set("PaymentRequestV3.CardAcceptor.City", paymentRequest.getCardAcceptor_City());
        map.set("PaymentRequestV3.CardAcceptor.State", paymentRequest.getCardAcceptor_State());
        map.set("PaymentRequestV3.CardAcceptor.PostalCode", paymentRequest.getCardAcceptor_PostalCode());
        map.set("PaymentRequestV3.CardAcceptor.Country", paymentRequest.getCardAcceptor_Country());
        map.set("PaymentRequestV3.TransactionDesc", paymentRequest.getTransactionDesc());
        map.set("PaymentRequestV3.MerchantId", paymentRequest.getMerchantId());
        map.set("PaymentRequestV3.ReceiverIdentification.Type", paymentRequest.getReceiverIdentification_Type());
        map.set("PaymentRequestV3.ReceiverIdentification.Number", paymentRequest.getReceiverIdentification_Number());
        map.set("PaymentRequestV3.ReceiverIdentification.CountryCode", paymentRequest.getReceiverIdentification_CountryCode());
        map.set("PaymentRequestV3.ReceiverIdentification.ExpirationDate", paymentRequest.getReceiverIdentification_ExpirationDate());
        map.set("PaymentRequestV3.ReceiverNationality", paymentRequest.getReceiverNationality());
        map.set("PaymentRequestV3.ReceiverCountryOfBirth", paymentRequest.getReceiverCountryOfBirth());
        map.set("PaymentRequestV3.SenderIdentification.Type", paymentRequest.getSenderIdentification_Type());
        map.set("PaymentRequestV3.SenderIdentification.Number", paymentRequest.getSenderIdentification_Number());
        map.set("PaymentRequestV3.SenderIdentification.CountryCode", paymentRequest.getSenderIdentification_CountryCode());
        map.set("PaymentRequestV3.SenderIdentification.ExpirationDate", paymentRequest.getSenderIdentification_ExpirationDate());
        map.set("PaymentRequestV3.SenderNationality", paymentRequest.getSenderNationality());
        map.set("PaymentRequestV3.SenderCountryOfBirth", paymentRequest.getSenderCountryOfBirth());
        map.set("PaymentRequestV3.TransactionPurpose", paymentRequest.getTransactionPurpose());

        
        
        Payment response = Payment.create(map);
        
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setRequestId(response.get("Transfer.RequestId").toString());
        paymentResponse.setTransactionReference(response.get("Transfer.TransactionReference").toString());
        paymentResponse.setTransactionType(response.get("Transfer.TransactionHistory.Transaction.Type").toString());
        paymentResponse.setTransactionSystemTraceAuditNumber(response.get("Transfer.TransactionHistory.Transaction.SystemTraceAuditNumber").toString());
        paymentResponse.setTransactionNetworkReferenceNumber(response.get("Transfer.TransactionHistory.Transaction.NetworkReferenceNumber").toString());
        paymentResponse.setTransactionSettlementDate(response.get("Transfer.TransactionHistory.Transaction.SettlementDate").toString());
        paymentResponse.setTransactionResponseCode(response.get("Transfer.TransactionHistory.Transaction.Response.Code").toString());
        paymentResponse.setTransactionResponseDescription(response.get("Transfer.TransactionHistory.Transaction.Response.Description").toString());
        paymentResponse.setTransactionSubmitDateTime(response.get("Transfer.TransactionHistory.Transaction.SubmitDateTime").toString());
        
        return paymentResponse;
        
        //return new PaymentResponse();
	}
}
