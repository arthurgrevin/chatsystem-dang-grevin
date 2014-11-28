package boundaries.swing;

import java.util.HashMap;
import java.util.Map;

import controller.ChatController;

import model.User;

public class ChatGUI {

    private Map<User, ChatWindow> chatWindows;
    private WelcomeWindow welcome;
    private ChatController chatController =  ChatController.getInstance();;
    
    private ChatGUI() {
    	chatWindows = new HashMap<User, ChatWindow>();
    }
    
	private static ChatGUI instance;

    public static ChatGUI getInstance() {
        if (instance == null)
            instance = new ChatGUI();
        return instance;
    }

    protected void createChatWindow(User user) {
        chatWindows.put(user, new ChatWindow(user));
    }
    
    public String getUserName(){
    	return welcome.getUserName();
    }
    
    public static void main(String[] args) {
    	ChatGUI gui = new ChatGUI();
    	WelcomeWindow welcome= new WelcomeWindow();
    }

	protected void processHello() {
		chatController.processHello();
	}
	

}