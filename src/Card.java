public class Card {
    private String CardNo;
    private String PinNo;

    Card(String CardNumber,String PinNumber){
         this.CardNo=CardNumber;
         this.PinNo=PinNumber;
    }

    public String getCardNo(){
        return this.CardNo;
    }

    public boolean validateCard(String PinNumber){
         return this.PinNo.equals((PinNumber));
    }
}
