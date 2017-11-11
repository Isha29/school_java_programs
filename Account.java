
/**
 1 deposit an amount for a customer and update the balance
 2 display the acc details
 3 compute the deposit interest
 4 withdraw amt for a customer after checking the balance and update the balance
 5 check for min balance
 Saving- comp interest n withdrawal fac
 Current- cheque book fac
 min bal 
 Acc- name, acc no and opening bal
 */
public abstract class Account
{  
    int accNo=0;
    String name=null;
    double openBalance=0.0;    
    abstract void input();    
}
