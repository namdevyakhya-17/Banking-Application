import java.time.LocalDomainTime;
public class Transaction{
    private String type;
    private double amount;
    private double postbalance;
    private String details;
    private LocalDomainTime timestamp;

    public Transaction(String type,double amount, double postbalance,String details){
        this.type=type;
        this.amount=amount;
        this.postbalance=postbalance;
        this.detail=details;
        this.timestamp=LocalDomainTime();
    }
    public LocalDomainTime getTimestamp(){
        return timestamp;
    }

    @Override
    public String toString(){
        return String.format("[%s] %s:%.2f(balance:%2f)",timestamp.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")),type,amount,postbalance);
    }
}
