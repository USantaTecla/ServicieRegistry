package usantatecla;

import usantatecla.models.Client;
import usantatecla.models.Service;
import usantatecla.views.menues.MainMenu;

import java.util.ArrayList;
import java.util.List;

class ServiceManager {
  
  private List<Client> clients;
  private List<Service> services;

  private ServiceManager(){
    this.clients = new ArrayList<Client>();
    this.services = new ArrayList<Service>();
  }

  private void manage() {
    new MainMenu(clients, services).execute();
  }
  
  public static void main(String[] args){
    new ServiceManager().manage();
  }

}