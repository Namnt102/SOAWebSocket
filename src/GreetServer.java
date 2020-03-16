import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public static ArrayList<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student("Nguyen Van A", "17020000", "K62IE1", "0916666666","email", "Address"),
                    new Student("Nguyen Van B", "17020001", "K62IE1", "0916666666","email", "Address"),
                    new Student("Nguyen Van C", "17020002", "K62IE1", "0916666666","email", "Address"),
                    new Student("Nguyen Van D", "17020003", "K62IE1", "0916666666","email", "Address")
                    ));

    public static Student getStudentByMSSV(String mssv){
        for(int i=0;i<students.size();i++) {
            if (students.get(i).getMSSV().equals(mssv)) {
                System.out.println(students.get(i).toString());
                return students.get(i);
            }
        }
        return null;
    }

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while(true){
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while(true){
                String mssv = in.readLine();
                if(mssv == null) break;
                System.out.println(mssv);
                Student student = getStudentByMSSV(mssv);
                if(student == null){
                    out.println("Not found student");
                }
                else {
                    out.println(student.toString());
                }
            }
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws IOException {
        GreetServer server = new GreetServer();
        server.start(6666);
    }
}