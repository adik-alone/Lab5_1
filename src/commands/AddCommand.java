package commands;

import app.CommandList;
import person.Person;

import java.util.TreeSet;

public class AddCommand implements Command {

    CommandList list;
    @Override
    public void execute() {
        System.out.println("add.execute");
        list.col_manager.Add();
    }

    @Override
    public void info() {
        System.out.println("add {element} : добавить новый элемент в коллекцию");
    }
    @Override
    public void addToList(CommandList l) {
        this.list = l;
    }
}
