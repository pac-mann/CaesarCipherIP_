
import com.Decode;
import com.Encode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            out.println("Hi! Welcome to my encoding application. Please choose: 1 (Encode), 2 (Decode) or 3 (Exit)");
            try {
                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("1")) {
                    out.println("Enter the text you want to encode here: ");
                    String stringPlainText = bufferedReader.readLine();
                    out.println(stringPlainText);

                    out.println("Enter your encryption key: ");
                    String stringEncodeKey = bufferedReader.readLine();
                    int intEncodeKey = Integer.parseInt(stringEncodeKey);
                    out.println(stringEncodeKey);
                    Encode encode = new Encode(stringPlainText, intEncodeKey);

                    char[] encryptChars = stringPlainText.toCharArray();
                    for (char c : encryptChars) {
                        c += intEncodeKey;
                        out.print(c);
                    }
                }
                else if (navigationChoice.equals("2")) {
                    out.println("Enter the text you want to decode here: ");
                    String stringPlainText = bufferedReader.readLine();
                    out.println(stringPlainText);

                    out.println("Enter your decryption key: ");
                    String stringDecodeKey = bufferedReader.readLine();
                    int intDecodeKey = Integer.parseInt(stringDecodeKey);
                    out.println(stringDecodeKey);
                    Decode decode = new Decode(stringPlainText, intDecodeKey);

                    char[] encryptChars = stringPlainText.toCharArray();
                    for (char c : encryptChars) {
                        c += -intDecodeKey;
                        out.print(c);
                    }
                }
                else if (navigationChoice.equals("3")) {
                    out.println("Goodbye!");
                    programRunning = false;
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
