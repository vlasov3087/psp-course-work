package connectionModule;

import Commands.AuthorizationCommand;
import Commands.Command;
import Commands.Response;
import entities.FinancedProject;
import entities.ProjectRequest;
import entities.ProjectType;
import entities.User;
import enums.UserType;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class ConnectionModule {

    private static Socket connectionSocket;
    private static final String serverIp;
    private static final int serverPort;
    private static ObjectOutputStream objectOutputStream;
    private static ObjectInputStream objectInputStream;

    private static Properties getPropertiesFromConfig() throws IOException {

        var properties = new Properties();
        String propFileName = "Client/ConnectionModule/src/main/resources/config.properties";
        var inputStream = new FileInputStream(propFileName);
        if (inputStream == null)
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        properties.load(inputStream);
        return properties;
    }

    static {
        try {
            var properties = getPropertiesFromConfig();
            serverIp = properties.getProperty("serverIp");
            serverPort = Integer.parseInt(properties.getProperty("serverPort"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean connectToServer() throws IOException {

        connectionSocket = new Socket(serverIp, serverPort);
        //connectionSocket.setSoTimeout(3000);
        if (!connectionSocket.isConnected()) return false;
        objectOutputStream = new ObjectOutputStream(connectionSocket.getOutputStream());
        objectInputStream = new ObjectInputStream(connectionSocket.getInputStream());
        return true;
    }

    private static void sendObject(Serializable object) throws IOException {

        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
    }

    private static  <T> T receiveObject() throws Exception {

        return (T) objectInputStream.readObject();
    }

    public static UserType singUp(String login, String password) throws Exception {

        sendObject(AuthorizationCommand.AUTHORIZE);
        sendObject(login);
        sendObject(password);
        return receiveObject();
    }

    public static Response registration(String login, String password, String fullName, String organization) throws Exception {

        sendObject(AuthorizationCommand.REGISTER);
        sendObject(login);
        sendObject(password);
        sendObject(fullName);
        sendObject(organization);
        return receiveObject();
    }

    //ТОЛЬКО ПРИ РЕГИСТРАЦИИ
    public static boolean checkIfLoginExists(String login) throws Exception {

        sendObject(AuthorizationCommand.CHECK_IF_LOGIN_EXISTS);
        sendObject(login);
        Response response = receiveObject();
        return response == Response.SUCCESSFULLY;
    }

    public static void exit() throws IOException {
        sendObject(Command.EXIT);
    }

    public static List<User> getAllUsers() throws Exception {
        sendObject(Command.GET_ALL_USERS);
        return receiveObject();
    }

    public static Response banUser(int userId) throws Exception {
        sendObject(Command.BAN_USER);
        sendObject(userId);
        return receiveObject();
    }

    public static Response unbanUser(int userId) throws Exception {
        sendObject(Command.UNBAN_USER);
        sendObject(userId);
        return receiveObject();
    }

    public static Response editUser(User newVersion) throws Exception {
        sendObject(Command.EDIT_USER);
        sendObject(newVersion);
        return receiveObject();
    }

    public static List<ProjectRequest> getAllProjects() throws Exception {
        sendObject(Command.GET_ALL_PROJECTS);
        return receiveObject();
    }

    public static List<FinancedProject> getAllAcceptedProjects() throws Exception {
        sendObject(Command.GET_ALL_ACCEPTED_PROJECTS);
        return receiveObject();
    }

    public static List<ProjectType> getAllProjectTypes() throws Exception {
        sendObject(Command.GET_ALL_PROJECT_TYPES);
        return receiveObject();
    }

    public static Response createProjectRequest(ProjectType projectType) throws Exception {
        sendObject(Command.CREATE_PROJECT_REQUEST);
        sendObject(projectType);
        return receiveObject();
    }
}