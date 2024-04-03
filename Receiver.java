import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {
    public static void main(String[] args) {
        try{
            //create Datagram socket and bind it to a port
            int Sendersport = 12345;
            DatagramSocket socket = new DatagramSocket(Sendersport);
            //create a byte array receiving data
            byte[] ReceivingData = new byte[1024];

            //create a datagram packet object and specify the data array
            DatagramPacket packet = new DatagramPacket(ReceivingData, ReceivingData.length);

            //invoke the receive method
            socket.receive(packet);

            //process the data
            String ReceivedMessage = new String(packet.getData());
            InetAddress SendersAddress = packet.getAddress();
            int sendersport = packet.getPort();

            System.out.println("received message from " + SendersAddress +" :" + sendersport);
            System.out.println("im fine thanks for asking");
            //close socket
            socket.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
    
}
