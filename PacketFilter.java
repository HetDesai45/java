    import java.net.DatagramPacket;
    import java.net.DatagramSocket;
    import java.util.*;

    import org.w3c.dom.events.EventException;

    public class PacketFilter {

        private static final int BUFFER_SIZE = 65536;

        public static void main(String[] args) {
            try {  
                DatagramSocket socket = new DatagramSocket(12345); // Replace with the desired port number

                System.out.println("Packet filter started. Listening on port: " + socket.getLocalPort());

                while (true) {
                    byte[] buffer = new byte[BUFFER_SIZE];
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                    // Receive the packet
                    socket.receive(packet);

                    // Process the packet
                    processPacket(packet);
                }
            } catch (java.lang.Exception e) {
                System.out.println(e);
            }
        }

        private static void processPacket(DatagramPacket packet) {
            // Extract information from the packet
            String sourceIpAddress = packet.getAddress().getHostAddress();
            int sourcePort = packet.getPort();
            byte[] data = packet.getData();

            // Example: Filter packets based on source IP address
            if ("YOUR_SOURCE_IP_ADDRESS".equals(sourceIpAddress)) {
                System.out.println("Filtered Packet: Source IP - " + sourceIpAddress + ", Source Port - " + sourcePort);
                return;
            }

            // Process the packet further if it passes the filter
            System.out.println("Packet: Source IP - " + sourceIpAddress + ", Source Port - " + sourcePort);
            // Additional processing logic can be added here
        }
    }