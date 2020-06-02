package usantatecla.utils;

import java.util.ArrayList;
import java.util.List;

public class Menu {

  private List<Command> commands;

  protected Menu(){
    this.commands = new ArrayList<Command>();
  }
  protected void add(Command command){
    this.commands.add(command);
  }

  public void execute(){
    int row = 1;
    for(Command command : this.commands){
      System.out.println(row+"."+command.getTitle());
    }
  }
}
