
package assigment4;
public class accountoverloadsafedemo implements Runnable {

    @Override
    public void run() {
        accountoverloadsafedemo.debit();
    }

    static void debit() {
        
        int debit=500;
         int i =0;
         while(i !=5){
          if(account.balance>=debit){
            System.out.println( Thread.currentThread().getName() + "debit"+ debit + "account");     
            account.withdraw(debit); 
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException exception){
             System.out.println("error is there !!!");
            }
        }
        else{
            System.out.println("no balnace left in account :(");
        }
         
        System.out.println("balnce is :" + account.balance);
         i++;

    }
    
}
}