package JSON_Practice;

import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorld {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://dev.datechnologies.co/Tests/scripts/chat_log.php");

            InputStream is = url.openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));


            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
