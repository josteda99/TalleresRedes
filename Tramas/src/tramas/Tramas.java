package tramas;

import java.net.NetworkInterface;

public class Tramas {

    public static void main(String[] args) {
        JpcapCaptor captor = JpcapCaptor.openDevice(devices[index], 65535, false, 1000);

        for (int i = 0; i < 10; i++) {

            System.out.println(captor.getPacket());
        }
        captor.close();
    }

}
