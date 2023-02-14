package adapter;

public class XpaytoPayDAdapter implements PayD{
    private final Xpay xpay;
    public XpaytoPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }
    @Override
    public String getCreditCardNo() { return xpay.getCreditCardNo(); }
    @Override
    public String getCardOwnerName() { return xpay.getCustomerName(); }
    @Override
    public String getCardExpMonthYear() { return xpay.getCardExpMonth() + xpay.getCardExpYear(); }
    @Override
    public Integer getCVVNo() { return Integer.valueOf(xpay.getCardCVVNo().shortValue()); }
    @Override
    public Double getTotalAmount() { return xpay.getAmount(); }
    @Override
    public void setCreditCardNo(String creditCardNo) { xpay.setCreditCardNo(creditCardNo); }
    @Override
    public void setCardOwnerName(String cardOwnerName) { xpay.setCustomerName(cardOwnerName); }
    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpYear(cardExpMonthYear.substring(0,2));
        xpay.setCardExpMonth(cardExpMonthYear.substring(2,4));
    }
    @Override
    public void setCVVNo(Integer cVVNo) { xpay.setCardCVVNo(cVVNo.shortValue()); }
    @Override
    public void setTotalAmount(Double totalAmount) { xpay.setAmount(totalAmount); }
    
}
