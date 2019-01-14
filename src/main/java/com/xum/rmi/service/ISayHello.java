package com.xum.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义rmi接口
 * 1.继承Remote
 * 2.抛出RemoteException异常
 */
public interface ISayHello extends Remote {

    public String sayHello(String name) throws RemoteException;

}
