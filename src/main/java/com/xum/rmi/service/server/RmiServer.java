package com.xum.rmi.service.server;

import com.xum.rmi.service.ISayHello;
import com.xum.rmi.service.SayHelloImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {

    public static void main(String[] args) {

        try {
            ISayHello sayHello = new SayHelloImpl();
            LocateRegistry.createRegistry(8888);

            Naming.bind("rmi://localhost:8888/sayHello",sayHello);
            System.out.println("server start");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
