package garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class ConcatenationInLoops {
    public static void  main(String[] args) throws IOException {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";

        String filename = "text.exe";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";

        for(byte b : inputBytes){
            outputString += (char)b;
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        for(int i=0; i<65536; i++)
            s += r.nextInt(2);
        System.out.println(System.currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 65536; i++){
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
