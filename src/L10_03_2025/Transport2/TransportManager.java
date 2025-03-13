package L10_03_2025.Transport2;

import java.util.*;

import static java.util.Arrays.stream;

public class TransportManager {
    protected static final Map<String, Transport> transportByPlate = new HashMap<>();
    protected static final Map<String, List<Transport>> transportByType = new HashMap<>();

    public static void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
        String type = transport.getClass().getSimpleName();
        transportByType.put(transport.getModel(), (List<Transport>) transport);
    }


    public void removeTransport(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        if (transport != null) {
            String type = transport.getClass().getSimpleName();
            transportByType.get(type).remove(transport);
            System.out.println();
        }
    }

    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> getTransportByType(String type) {
        return transportByType.get(type);
    }

    public Transport getFastestTransportByType(String type) {
        return (Transport) transportByType.get(type);
    }

    public void printAllTransport() {
        transportByPlate.values().forEach(System.out::println);
    }
}