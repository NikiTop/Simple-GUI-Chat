package ru.nikitop.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection); /*когда соединение готово*/
    void onReceiveString(TCPConnection tcpConnection, String value); /*соединение приняло строчку*/
    void onDisconnect(TCPConnection tcpConnection); /*соединение порвалось*/
    void onExeption(TCPConnection tcpConnection, Exception e); /*принято исключение*/
}
