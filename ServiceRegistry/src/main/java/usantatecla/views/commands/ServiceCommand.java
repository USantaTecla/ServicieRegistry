package usantatecla.views.commands;

import usantatecla.models.Client;
import usantatecla.models.Service;
import usantatecla.utils.Command;

import java.util.List;

public class ServiceCommand extends Command {

  private List<Service> services;
  private List<Client> clients;

  public ServiceCommand(List<Service> services, List<Client> clients) {
    super("Servicios");
    this.services = services;
    this.clients = clients;
  }

  public void execute(){
    System.out.println("servicios ...");
  }

}
