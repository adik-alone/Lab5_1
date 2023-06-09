package commands;

import app.CollectionManager;
import app.CommandList;
import person.Person;

import java.util.TreeSet;

public class ShowCommand implements Command {
    CommandList list;
    @Override
    public void execute() {
        System.out.println("show.execute");
        list.col_manager.Show();
    }

    @Override
    public void info() {
        System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    @Override
    public void addToList(CommandList list) {
        this.list = list;
    }
}
