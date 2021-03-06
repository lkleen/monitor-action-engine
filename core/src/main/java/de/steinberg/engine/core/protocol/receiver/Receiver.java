package de.steinberg.engine.core.protocol.receiver;

import de.steinberg.engine.core.protocol.message.Message;

import java.net.SocketException;

/**
 * Created by lkleen on 22.11.2016.
 */
public interface Receiver<T> {
    Message<T> receive() throws SocketException;
}
