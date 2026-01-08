import java.util.HashMap;
import java.util.Map;

public class Bank {
     private Map<String,User> users=new HashMap<>();

     public void AddUser(User user){
           users.put(user.getUSerCard().getCardNo(),user);
     }

     public User AuthenticateUser(String CardNumber,String PinNumber){
          User user=users.get(CardNumber);

          if(user==null){
              return null;

          }else{
               if(user.getUSerCard().validateCard(PinNumber)){
                    return user;
               }
         }

          return null;
     }



}
