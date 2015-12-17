package taak.create;

import be.gilit.task.create.adapter.jms.v1.TaakAanmaken;
import tasksystem.application.commands.CreateTaskCommand;

/**
 * Created by gitim on 17/12/2015.
 */
public class Mapper {

    public static CreateTaskCommand map(TaakAanmaken taakAanmaken){
        return CreateTaskCommand.newBuilder().build();
    }
}
