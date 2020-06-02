package usantatecla.views.commands;

import usantatecla.models.Client;
import usantatecla.utils.Command;

import java.util.List;

public class ClientsCommand extends Command {

  private List<Client> clients;

  public ClientsCommand(List<Client> clients) {
    super("Clientes");
    this.clients = clients;
  }

  public void execute(){
    System.out.println("clientes ...");
  }

}
