package medical.app;

import java.util.ArrayList;

import medical.core.ApplicationInterface;
import medical.core.controllers.ControllerInterface;
import medical.core.models.MedicoFactory;
import medical.core.models.ModelInterface;
import medical.helpers.Continue;
import medical.helpers.InputID;
import medical.helpers.menu.Menu;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App implements ApplicationInterface {
    
    @Override
    public void run(ArrayList<ControllerInterface> controllers) {
        
        ControllerInterface controller = controllers.get(0);
        
        while (true) {
            controller.restore();
            
            (new Menu())
                .add("Inserir medico", () -> {
                    MedicoFactory factory = new MedicoFactory();
                    
                    Continue.load("Cadastrar mais medicos?", () -> factory.create());

                    controller.register(factory.dataModel());
                    
                    controller.save();
                })
                .add("Listar medicos", () -> {
                    ArrayList<ModelInterface> medicos = controller.listAll();
                    
                    if (medicos == null || medicos.isEmpty()) {
                        System.out.println("Nao ha registros");
                    } else {
                        for (ModelInterface medico: medicos)
                            System.out.println(medico);
                    }
                })
                .add("Remover medico (ID)", () -> {
                    controller.remove(InputID.show());
                    controller.save();
                })
                .add("Buscar medico (ID)", () -> {
                    ArrayList<ModelInterface> medico = controller.findById(InputID.show());
                    
                    if (medico == null || medico.isEmpty()) {
                        System.out.println("Registro nao encontrado");
                    } else {
                        System.out.println(medico.get(0));
                    }
                }).run();
        }
        
    }
    
}
