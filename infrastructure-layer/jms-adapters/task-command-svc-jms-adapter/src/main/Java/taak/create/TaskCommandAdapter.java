package taak.create;

import be.gilit.task.create.adapter.jms.v1.TaakAanmakenBericht;
import org.springframework.beans.factory.annotation.Autowired;
import tasksystem.services.TaskCreateService;

class TaskCommandAdapter {

    @Autowired
    private TaskCreateService taskCreateService;

    public TaskCommandAdapter() {
    }

    public void onMessage(TaakAanmakenBericht bericht){

    }
}
