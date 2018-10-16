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
	
	public Chatbot()
	{
		this.joke = "Why did the monkey cross the road? cause I watned to get to out village ";
		this.currentUser = new String("Then I beat the monkey");
		this.content = new String("Then the  monkey never came back to our village");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("No");
		responseList.add("goodbye.");
		responseList.add("Hi im TI who are you");
		responseList.add("give me info");
		responseList.add("Oh your just a normal human ok then.....")
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
