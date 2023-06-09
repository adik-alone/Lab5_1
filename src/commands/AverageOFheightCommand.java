package commands;

import app.CommandList;

public class AverageOFheightCommand implements Command {
    CommandList list;
    @Override
    public void execute() {
        list.col_manager.average();
    }

    @Override
    public void info() {
        System.out.println("average_of_height : вывести среднее значение поля height для всех элементов коллекции");
    }

    @Override
    public void addToList(CommandList l) {
        list = l;
    }
}
