package botchat;

import javax.swing.JOptionPane;

public class Controllerbot
{
	private void simpleBot()
	{

	}
	public void chatController()
	{
		simpleBot = new Chatbot();
		
	}

public void start()
	
	{
		String userInput = "";
		
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput)
					
		}
	}
	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(text);
		chatbotSays = simpleBot.processText(userInput);
		return chatbotSays;
	}

	public void get()
	{

	}

	public void ChatController()
	{

	}



}
