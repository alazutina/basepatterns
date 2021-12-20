package creational.Singleton;

public class Wallet {

    private  static  Wallet wallet;
    private static int sum  = 0;

    public static synchronized Wallet getWallet(){
        if(wallet == null){
            wallet = new Wallet();
        }
        return wallet;
    }

    private Wallet(){

    }

    public void addMoney(int i){
        sum = sum + i;
    }

    public void showSumOfWallet(){
        System.out.println(sum+ "$ is in the wallet");

    }

}
