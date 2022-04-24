
import com.Encode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        try {
            out.println("Enter your plain text here: ");
            String stringPlainText = bufferedReader.readLine();
            out.println(stringPlainText);

            out.println("Enter your encryption key: ");
            String stringEncodeKey = bufferedReader.readLine();
            int intEncodeKey = Integer.parseInt(stringEncodeKey);
            out.println(stringEncodeKey);
            Encode encode = new Encode(stringPlainText, intEncodeKey);

            char[] encryptChars = stringPlainText.toCharArray();
            for(char c : encryptChars) {
                c += intEncodeKey;
                out.print(c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
