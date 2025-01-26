import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLReader {
    public static InputStream getUrlInputStream(String urlAddress) throws IOException {
        URL url = new URL(urlAddress);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            return connection.getInputStream();
        } else {
            throw new IOException("Failed to read URL. Response code: " + responseCode);
        }
    }

    public static void main(String[] args) {
        String urlAddress = "https://assets-frota.aleloauto.com.br/minha-frota/img/veloego-report-logo.png";
        try {
            InputStream inputStream = getUrlInputStream(urlAddress);
            System.out.println(inputStream.available());
            // Now you have the content of the URL as an InputStream
            // You can use this inputStream as needed, e.g., to read data or save it to a file
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
