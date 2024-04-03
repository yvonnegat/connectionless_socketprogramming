import java.net.*;

public class Sender {
    public static void main(String []args){
        try{
        //craete a datagram socket
        DatagramSocket socket = new DatagramSocket();

        //place your message in a  byte array
        String message = "hello how are you";
        byte[] sendData = message.getBytes();

        //create your Datagram packet
        InetAddress ReceiverAddress = InetAddress.getByName("localhost");
        int port = 12345;
        DatagramPacket packet = new DatagramPacket(sendData, sendData.length , ReceiverAddress , port);

        //invoke the send Method to send packet 
        socket.send(packet);
        System.out.println("message sent");
        //close socket
        socket.close();

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
} 