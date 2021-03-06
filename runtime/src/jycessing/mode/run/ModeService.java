package jycessing.mode.run;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ModeService extends Remote {
  void handleReady(final SketchService service) throws RemoteException;

  void handleSketchStopped() throws RemoteException;

  void handleSketchException(Exception e) throws RemoteException;

  void print(Stream stream, String s) throws RemoteException;

  void println(Stream stream, String s) throws RemoteException;
}
