package com.virtusa.mastercard.model;

public class PaymentResponse {
	
	String RequestId;
    String TransactionReference;
    String TransactionType;
    String TransactionSystemTraceAuditNumber;
    String TransactionNetworkReferenceNumber;
    String TransactionSettlementDate;
    String TransactionResponseCode;
    String TransactionResponseDescription;
    String TransactionSubmitDateTime;
    String Error;
    
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public String getTransactionReference() {
		return TransactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		TransactionReference = transactionReference;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getTransactionSystemTraceAuditNumber() {
		return TransactionSystemTraceAuditNumber;
	}
	public void setTransactionSystemTraceAuditNumber(String transactionSystemTraceAuditNumber) {
		TransactionSystemTraceAuditNumber = transactionSystemTraceAuditNumber;
	}
	public String getTransactionNetworkReferenceNumber() {
		return TransactionNetworkReferenceNumber;
	}
	public void setTransactionNetworkReferenceNumber(String transactionNetworkReferenceNumber) {
		TransactionNetworkReferenceNumber = transactionNetworkReferenceNumber;
	}
	public String getTransactionSettlementDate() {
		return TransactionSettlementDate;
	}
	public void setTransactionSettlementDate(String transactionSettlementDate) {
		TransactionSettlementDate = transactionSettlementDate;
	}
	public String getTransactionResponseCode() {
		return TransactionResponseCode;
	}
	public void setTransactionResponseCode(String transactionResponseCode) {
		TransactionResponseCode = transactionResponseCode;
	}
	public String getTransactionResponseDescription() {
		return TransactionResponseDescription;
	}
	public void setTransactionResponseDescription(String transactionResponseDescription) {
		TransactionResponseDescription = transactionResponseDescription;
	}
	public String getTransactionSubmitDateTime() {
		return TransactionSubmitDateTime;
	}
	public void setTransactionSubmitDateTime(String transactionSubmitDateTime) {
		TransactionSubmitDateTime = transactionSubmitDateTime;
	}
	public String getError() {
		return Error;
	}
	public void setError(String error) {
		Error = error;
	}
    
    
    
}
