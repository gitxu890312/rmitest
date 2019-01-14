package com.xum.rmi.service.client;

import com.xum.rmi.service.ISayHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * rmi client 客户端
 */
public class RmiClient {

    public static void main(String[] args) {

        try {
            ISayHello sayHello = (ISayHello)Naming.lookup("rmi://localhost:8888/sayHello");
            String s = sayHello.sayHello("xuming");
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
