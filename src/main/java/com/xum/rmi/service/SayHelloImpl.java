package com.xum.rmi.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 实现rmi接口
 * 继承 UnicastRemoteObject
 */
public class SayHelloImpl extends UnicastRemoteObject implements ISayHello {

    public SayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) {
            return "hello rmi,"+name;
    }
}
