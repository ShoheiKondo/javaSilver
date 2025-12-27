package javaSilver;

import java.io.Closeable;
import java.io.IOException;

public class SampleResource6_21 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}