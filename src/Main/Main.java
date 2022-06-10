package Main;

import SuperMarketManager.SuperMarketManager;

public class Main {
    public static void main(String[] args) {
        SuperMarketManager superMarketManager = new SuperMarketManager();
        while (true) {
            superMarketManager.login();
        }
    }
}
