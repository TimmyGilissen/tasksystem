package taak.create;

import be.gilit.task.create.adapter.jms.v1.TaakAanmaken;
import be.gilit.task.create.adapter.jms.v1.TaakAanmakenBericht;
import tasksystem.application.commands.CreateTaskCommand;
import tasksystem.application.services.CreateTaskService;

import static taak.create.Mapper.map;

class TaskCommandAdapter {
    private final CreateTaskService createTaskService;

    public TaskCommandAdapter(CreateTaskService createTaskService) {
        this.createTaskService = createTaskService;
    }

    public void onMessage(TaakAanmakenBericht bericht) {
        for (TaakAanmaken taakAanmaken : bericht.getTaken().getTaak()) {
            CreateTaskCommand createTaskCommand = map(taakAanmaken);

            createTaskService.create(createTaskCommand);
        }
    }
}
