public class User {
    private String UserName;
    private Card USerCard;
    private Account UserAccount;

    User(String Name,Card card,Account acc){
         this.UserAccount=acc;
         this.UserName=Name;
         this.USerCard=card;
    }

    public Card getUSerCard(){
        return this.USerCard;
    }

    public Account getUserAccount(){
         return this.UserAccount;
    }
}
