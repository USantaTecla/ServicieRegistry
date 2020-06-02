package usantatecla.views.menues;

import usantatecla.models.Client;
import usantatecla.models.Service;
import usantatecla.utils.Menu;
import usantatecla.views.commands.ClientsCommand;
import usantatecla.views.commands.ServiceCommand;
import java.util.List;

public class MainMenu extends Menu {

	public MainMenu(List<Client> clients, List<Service> services) {
    this.add(new ClientsCommand(clients));
    this.add(new ServiceCommand(services, clients));
	}

}
