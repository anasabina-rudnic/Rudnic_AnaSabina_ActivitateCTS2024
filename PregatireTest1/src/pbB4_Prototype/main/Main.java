package pbB4_Prototype.main;

import pbB4_Prototype.clase.Client;
import pbB4_Prototype.clase.ClientAbstract;

public class Main {
    public static void main(String[] args) {
        Client clientPrototip = new Client("Dinu Marian", true, 26);
        ClientAbstract client = clientPrototip.clone();
        System.out.println(client);
    }
}
