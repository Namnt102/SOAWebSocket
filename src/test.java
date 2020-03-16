import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void testGetExistStudent() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("17020000");
        assertEquals(GreetServer.getStudentByMSSV("17020000").toString(), response);
        response = client.sendMessage("18181818");
        assertEquals("Not found student", response);
        client.stopConnection();
    }

    @Test
    public void testGetNotExistStudent() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("18181818");
        client.stopConnection();
        assertEquals("Not found student", response);
    }
}
