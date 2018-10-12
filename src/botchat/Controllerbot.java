package botchat;

import javax.swing.JOptionPane;

public class Controllerbot
{
	private void simpleBot()
	{

	}

	public void interactWithChatbot()
	{

	}

	public void get()
	{

	}

	public void ChatController()
	{

	}

	public void start()
	{
		String userText = "Hi";
		
		while(!userText.equalsIgnoreCase("quit"))
		{
			userText= JOptionPane.showInputDialog(null,"Type quit to exit the chat");
		}
	}

}
