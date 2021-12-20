package creational.Singleton;

public class UseWallet {
    public static void main(String [] args){
Wallet w = Wallet.getWallet();

w.showSumOfWallet();

w.addMoney(20);
System.out.println("add "+ 20);
w.showSumOfWallet();

        w.addMoney(10);
        System.out.println("add "+ 10);
        w.showSumOfWallet();

        w.addMoney(10);
        System.out.println("add "+ 10);
        w.showSumOfWallet();
    }
}
