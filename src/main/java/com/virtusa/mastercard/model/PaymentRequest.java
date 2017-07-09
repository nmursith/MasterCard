package com.virtusa.mastercard.model;

public class PaymentRequest {
	String LocalDate;
    String LocalTime;
    String TransactionReference;
    String SenderName_First;
    String SenderName_Middle;
    String SenderName_Last;
    String SenderPhone;
    String SenderDateOfBirth;
    String SenderAddress_Line1;
    String SenderAddress_City;
    String SenderAddress_CountrySubdivision;
    String SenderAddress_PostalCode;
    String SenderAddress_Country;
    String FundingCard_AccountNumber;
    String FundingSource;
    String AdditionalMessage;
    String ParticipationID;
    String LanguageIdentification;
    String LanguageData;
    String ReceivingCard_AccountNumber;
    String ReceiverName_First;
    String ReceiverName_Middle;
    String ReceiverName_Last;
    String ReceiverAddress_Line1;
    String ReceiverAddress_Line2;
    String ReceiverAddress_City;
    String ReceiverAddress_CountrySubdivision;
    String ReceiverAddress_PostalCode;
    String ReceiverAddress_Country;
    String ReceiverPhone;
    String ReceiverDateOfBirth;
    String ReceivingMapped_SubscriberId;
    String ReceivingMapped_SubscriberType;
    String ReceivingMapped_SubscriberAlias;
    String ReceivingAmount_Value;
    String ReceivingAmount_Currency;
    String ICA;
    String ProcessorId;
    String RoutingAndTransitNumber;
    String CardAcceptor_Name;
    String CardAcceptor_City;
    String CardAcceptor_State;
    String CardAcceptor_PostalCode;
    String CardAcceptor_Country;
    String TransactionDesc;
    String MerchantId;
    String ReceiverIdentification_Type;
    String ReceiverIdentification_Number;
    String ReceiverIdentification_CountryCode;
    String ReceiverIdentification_ExpirationDate;
    String ReceiverNationality;
    String ReceiverCountryOfBirth;
    String SenderIdentification_Type;
    String SenderIdentification_Number;
    String SenderIdentification_CountryCode;
    String SenderIdentification_ExpirationDate;
    String SenderNationality;
    String SenderCountryOfBirth;
    String TransactionPurpose;
    
    /*
    String FundingMapped_SubscriberId;
    String FundingMapped_SubscriberType;
    String FundingMapped_SubscriberAlias;
    // Added these attributes and created setters and getters for these - Chinthana
    
	String SenderAddress;
    

    String Channel;
    
*/    
    
    
	public String getLocalDate() {
		return LocalDate;
	}
	public void setLocalDate(String localDate) {
		LocalDate = localDate;
	}
	public String getLocalTime() {
		return LocalTime;
	}
	public void setLocalTime(String localTime) {
		LocalTime = localTime;
	}
	public String getTransactionReference() {
		return TransactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		TransactionReference = transactionReference;
	}
	public String getSenderName_First() {
		return SenderName_First;
	}
	public void setSenderName_First(String senderName_First) {
		SenderName_First = senderName_First;
	}
	public String getSenderName_Middle() {
		return SenderName_Middle;
	}
	public void setSenderName_Middle(String senderName_Middle) {
		SenderName_Middle = senderName_Middle;
	}
	public String getSenderName_Last() {
		return SenderName_Last;
	}
	public void setSenderName_Last(String senderName_Last) {
		SenderName_Last = senderName_Last;
	}
	public String getSenderPhone() {
		return SenderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
	}
	public String getSenderDateOfBirth() {
		return SenderDateOfBirth;
	}
	public void setSenderDateOfBirth(String senderDateOfBirth) {
		SenderDateOfBirth = senderDateOfBirth;
	}
	public String getSenderAddress_Line1() {
		return SenderAddress_Line1;
	}
	public void setSenderAddress_Line1(String senderAddress_Line1) {
		SenderAddress_Line1 = senderAddress_Line1;
	}
	public String getSenderAddress_City() {
		return SenderAddress_City;
	}
	public void setSenderAddress_City(String senderAddress_City) {
		SenderAddress_City = senderAddress_City;
	}
	public String getSenderAddress_CountrySubdivision() {
		return SenderAddress_CountrySubdivision;
	}
	public void setSenderAddress_CountrySubdivision(String senderAddress_CountrySubdivision) {
		SenderAddress_CountrySubdivision = senderAddress_CountrySubdivision;
	}
	public String getSenderAddress_PostalCode() {
		return SenderAddress_PostalCode;
	}
	public void setSenderAddress_PostalCode(String senderAddress_PostalCode) {
		SenderAddress_PostalCode = senderAddress_PostalCode;
	}
	public String getSenderAddress_Country() {
		return SenderAddress_Country;
	}
	public void setSenderAddress_Country(String senderAddress_Country) {
		SenderAddress_Country = senderAddress_Country;
	}
//	public String getFundingMapped_SubscriberId() {
//		return FundingMapped_SubscriberId;
//	}
//	public void setFundingMapped_SubscriberId(String fundingMapped_SubscriberId) {
//		FundingMapped_SubscriberId = fundingMapped_SubscriberId;
//	}
//	public String getFundingMapped_SubscriberType() {
//		return FundingMapped_SubscriberType;
//	}
//	public void setFundingMapped_SubscriberType(String fundingMapped_SubscriberType) {
//		FundingMapped_SubscriberType = fundingMapped_SubscriberType;
//	}
//	public String getFundingMapped_SubscriberAlias() {
//		return FundingMapped_SubscriberAlias;
//	}
//	public void setFundingMapped_SubscriberAlias(String fundingMapped_SubscriberAlias) {
//		FundingMapped_SubscriberAlias = fundingMapped_SubscriberAlias;
//	}
	public String getFundingSource() {
		return FundingSource;
	}
	public void setFundingSource(String fundingSource) {
		FundingSource = fundingSource;
	}
	public String getAdditionalMessage() {
		return AdditionalMessage;
	}
	public void setAdditionalMessage(String additionalMessage) {
		AdditionalMessage = additionalMessage;
	}
	public String getParticipationID() {
		return ParticipationID;
	}
	public void setParticipationID(String participationID) {
		ParticipationID = participationID;
	}
	public String getLanguageIdentification() {
		return LanguageIdentification;
	}
	public void setLanguageIdentification(String languageIdentification) {
		LanguageIdentification = languageIdentification;
	}
	public String getLanguageData() {
		return LanguageData;
	}
	public void setLanguageData(String languageData) {
		LanguageData = languageData;
	}
	public String getReceiverName_First() {
		return ReceiverName_First;
	}
	public void setReceiverName_First(String receiverName_First) {
		ReceiverName_First = receiverName_First;
	}
	public String getReceiverName_Middle() {
		return ReceiverName_Middle;
	}
	public void setReceiverName_Middle(String receiverName_Middle) {
		ReceiverName_Middle = receiverName_Middle;
	}
	public String getReceiverName_Last() {
		return ReceiverName_Last;
	}
	public void setReceiverName_Last(String receiverName_Last) {
		ReceiverName_Last = receiverName_Last;
	}
	public String getReceiverAddress_Line1() {
		return ReceiverAddress_Line1;
	}
	public void setReceiverAddress_Line1(String receiverAddress_Line1) {
		ReceiverAddress_Line1 = receiverAddress_Line1;
	}
	public String getReceiverAddress_City() {
		return ReceiverAddress_City;
	}
	public void setReceiverAddress_City(String receiverAddress_City) {
		ReceiverAddress_City = receiverAddress_City;
	}
	public String getReceiverAddress_CountrySubdivision() {
		return ReceiverAddress_CountrySubdivision;
	}
	public void setReceiverAddress_CountrySubdivision(String receiverAddress_CountrySubdivision) {
		ReceiverAddress_CountrySubdivision = receiverAddress_CountrySubdivision;
	}
	public String getReceiverAddress_PostalCode() {
		return ReceiverAddress_PostalCode;
	}
	public void setReceiverAddress_PostalCode(String receiverAddress_PostalCode) {
		ReceiverAddress_PostalCode = receiverAddress_PostalCode;
	}
	public String getReceiverAddress_Country() {
		return ReceiverAddress_Country;
	}
	public void setReceiverAddress_Country(String receiverAddress_Country) {
		ReceiverAddress_Country = receiverAddress_Country;
	}
	public String getReceiverPhone() {
		return ReceiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		ReceiverPhone = receiverPhone;
	}
	public String getReceiverDateOfBirth() {
		return ReceiverDateOfBirth;
	}
	public void setReceiverDateOfBirth(String receiverDateOfBirth) {
		ReceiverDateOfBirth = receiverDateOfBirth;
	}
	public String getReceivingMapped_SubscriberId() {
		return ReceivingMapped_SubscriberId;
	}
	public void setReceivingMapped_SubscriberId(String receivingMapped_SubscriberId) {
		ReceivingMapped_SubscriberId = receivingMapped_SubscriberId;
	}
	public String getReceivingMapped_SubscriberType() {
		return ReceivingMapped_SubscriberType;
	}
	public void setReceivingMapped_SubscriberType(String receivingMapped_SubscriberType) {
		ReceivingMapped_SubscriberType = receivingMapped_SubscriberType;
	}
	public String getReceivingMapped_SubscriberAlias() {
		return ReceivingMapped_SubscriberAlias;
	}
	public void setReceivingMapped_SubscriberAlias(String receivingMapped_SubscriberAlias) {
		ReceivingMapped_SubscriberAlias = receivingMapped_SubscriberAlias;
	}
	public String getReceivingAmount_Value() {
		return ReceivingAmount_Value;
	}
	public void setReceivingAmount_Value(String receivingAmount_Value) {
		ReceivingAmount_Value = receivingAmount_Value;
	}
	public String getReceivingAmount_Currency() {
		return ReceivingAmount_Currency;
	}
	public void setReceivingAmount_Currency(String receivingAmount_Currency) {
		ReceivingAmount_Currency = receivingAmount_Currency;
	}
//	public String getChannel() {
//		return Channel;
//	}
//	public void setChannel(String channel) {
//		Channel = channel;
//	}
	public String getICA() {
		return ICA;
	}
	public void setICA(String iCA) {
		ICA = iCA;
	}
	public String getProcessorId() {
		return ProcessorId;
	}
	public void setProcessorId(String processorId) {
		ProcessorId = processorId;
	}
	public String getRoutingAndTransitNumber() {
		return RoutingAndTransitNumber;
	}
	public void setRoutingAndTransitNumber(String routingAndTransitNumber) {
		RoutingAndTransitNumber = routingAndTransitNumber;
	}
	public String getCardAcceptor_Name() {
		return CardAcceptor_Name;
	}
	public void setCardAcceptor_Name(String cardAcceptor_Name) {
		CardAcceptor_Name = cardAcceptor_Name;
	}
	public String getCardAcceptor_City() {
		return CardAcceptor_City;
	}
	public void setCardAcceptor_City(String cardAcceptor_City) {
		CardAcceptor_City = cardAcceptor_City;
	}
	public String getCardAcceptor_State() {
		return CardAcceptor_State;
	}
	public void setCardAcceptor_State(String cardAcceptor_State) {
		CardAcceptor_State = cardAcceptor_State;
	}
	public String getCardAcceptor_PostalCode() {
		return CardAcceptor_PostalCode;
	}
	public void setCardAcceptor_PostalCode(String cardAcceptor_PostalCode) {
		CardAcceptor_PostalCode = cardAcceptor_PostalCode;
	}
	public String getCardAcceptor_Country() {
		return CardAcceptor_Country;
	}
	public void setCardAcceptor_Country(String cardAcceptor_Country) {
		CardAcceptor_Country = cardAcceptor_Country;
	}
	public String getTransactionDesc() {
		return TransactionDesc;
	}
	public void setTransactionDesc(String transactionDesc) {
		TransactionDesc = transactionDesc;
	}
	public String getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}
	
//	public String getSenderAddress() {
//		return SenderAddress;
//	}
//	public void setSenderAddress(String senderAddress) {
//		SenderAddress = senderAddress;
//	}
	public String getFundingCard_AccountNumber() {
		return FundingCard_AccountNumber;
	}
	public void setFundingCard_AccountNumber(String fundingCard_AccountNumber) {
		FundingCard_AccountNumber = fundingCard_AccountNumber;
	}
	public String getReceivingCard_AccountNumber() {
		return ReceivingCard_AccountNumber;
	}
	public void setReceivingCard_AccountNumber(String receivingCard_AccountNumber) {
		ReceivingCard_AccountNumber = receivingCard_AccountNumber;
	}
	public String getReceiverAddress_Line2() {
		return ReceiverAddress_Line2;
	}
	public void setReceiverAddress_Line2(String receiverAddress_Line2) {
		ReceiverAddress_Line2 = receiverAddress_Line2;
	}
	public String getReceiverIdentification_Type() {
		return ReceiverIdentification_Type;
	}
	public void setReceiverIdentification_Type(String receiverIdentification_Type) {
		ReceiverIdentification_Type = receiverIdentification_Type;
	}
	public String getReceiverIdentification_Number() {
		return ReceiverIdentification_Number;
	}
	public void setReceiverIdentification_Number(String receiverIdentification_Number) {
		ReceiverIdentification_Number = receiverIdentification_Number;
	}
	public String getReceiverIdentification_CountryCode() {
		return ReceiverIdentification_CountryCode;
	}
	public void setReceiverIdentification_CountryCode(String receiverIdentification_CountryCode) {
		ReceiverIdentification_CountryCode = receiverIdentification_CountryCode;
	}
	public String getReceiverIdentification_ExpirationDate() {
		return ReceiverIdentification_ExpirationDate;
	}
	public void setReceiverIdentification_ExpirationDate(String receiverIdentification_ExpirationDate) {
		ReceiverIdentification_ExpirationDate = receiverIdentification_ExpirationDate;
	}
	public String getReceiverNationality() {
		return ReceiverNationality;
	}
	public void setReceiverNationality(String receiverNationality) {
		ReceiverNationality = receiverNationality;
	}
	public String getReceiverCountryOfBirth() {
		return ReceiverCountryOfBirth;
	}
	public void setReceiverCountryOfBirth(String receiverCountryOfBirth) {
		ReceiverCountryOfBirth = receiverCountryOfBirth;
	}
	public String getSenderIdentification_Type() {
		return SenderIdentification_Type;
	}
	public void setSenderIdentification_Type(String senderIdentification_Type) {
		SenderIdentification_Type = senderIdentification_Type;
	}
	public String getSenderIdentification_Number() {
		return SenderIdentification_Number;
	}
	public void setSenderIdentification_Number(String senderIdentification_Number) {
		SenderIdentification_Number = senderIdentification_Number;
	}
	public String getSenderIdentification_CountryCode() {
		return SenderIdentification_CountryCode;
	}
	public void setSenderIdentification_CountryCode(String senderIdentification_CountryCode) {
		SenderIdentification_CountryCode = senderIdentification_CountryCode;
	}
	public String getSenderIdentification_ExpirationDate() {
		return SenderIdentification_ExpirationDate;
	}
	public void setSenderIdentification_ExpirationDate(String senderIdentification_ExpirationDate) {
		SenderIdentification_ExpirationDate = senderIdentification_ExpirationDate;
	}
	public String getSenderNationality() {
		return SenderNationality;
	}
	public void setSenderNationality(String senderNationality) {
		SenderNationality = senderNationality;
	}
	public String getSenderCountryOfBirth() {
		return SenderCountryOfBirth;
	}
	public void setSenderCountryOfBirth(String senderCountryOfBirth) {
		SenderCountryOfBirth = senderCountryOfBirth;
	}
	public String getTransactionPurpose() {
		return TransactionPurpose;
	}
	public void setTransactionPurpose(String transactionPurpose) {
		TransactionPurpose = transactionPurpose;
	}
    
    
}
