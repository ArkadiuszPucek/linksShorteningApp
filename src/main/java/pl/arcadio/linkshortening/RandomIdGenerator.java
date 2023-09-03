package pl.arcadio.linkshortening;

import java.util.UUID;

public class RandomIdGenerator {
    private static final int ID_SIZE = 10;

    public static String generateId(){
        return UUID.randomUUID()
                .toString()
                .replace("-","")
                .substring(0,ID_SIZE);
    }
}
