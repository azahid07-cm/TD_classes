package TD_classes;

public class Exercice6 {
    public static class BankAccount{
        private String iban;
        private long balanceInCents;
        public BankAccount(String iban,long BIC){
            if(iban==null || iban.isBlank())
                throw new IllegalArgumentException("Iban doit etre non vide ou null!");
            else
                this.iban=iban;
            if(BIC>0)
                this.balanceInCents=BIC;
            else
                throw new IllegalArgumentException("Solde doit etre non negatif!");
        }
        public void deposit(long amount){
            if(amount<0)
                throw new IllegalArgumentException("Montant doit etre positif!");
            else
                this.balanceInCents+=amount;
        }
        public void withdraw(long amount){
            if(amount<0 || amount>this.balanceInCents)
                throw new IllegalArgumentException("Montant doit etre positif!");
            else
                this.balanceInCents-=amount;
        }
        public long getBalanceInCents(){return this.balanceInCents;}
    }
    public static void main(String args[]){
        BankAccount B1=new BankAccount("yfy", 2500);
        System.out.println("Montant: "+B1.getBalanceInCents());
        B1.deposit(1500);
        System.out.println("Montant(apres deposit): "+B1.getBalanceInCents());
        B1.withdraw(2000);
        System.out.println("Montant(apres draw): "+B1.getBalanceInCents());
    }
}
