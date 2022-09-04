package DecoratedCustomIOReader;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\manan\\OneDrive\\Desktop\\Design Patterns\\DecoratorPattern\\src\\main\\java\\DecoratedCustomIOReader\\test.txt")
                            )
                    );

            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
