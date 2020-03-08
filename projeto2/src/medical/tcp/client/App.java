package medical.tcp.client;

import medical.core.helpers.Continue;
import medical.core.helpers.InputID;
import medical.core.helpers.menu.Menu;
import medical.core.models.MedicoFactory;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App {
    
    public static void process() {
        
        Client client = new Client();
        
        while (true) {

            (new Menu())
                .add("Inserir medico", () -> {
                    MedicoFactory factory = new MedicoFactory();

                    Continue.load("Cadastrar mais medicos?", () -> factory.create());

                    client.send(new Service("medicos", "store", factory.data()));
                })
                .add("Listar medicos", () -> {
                    client.receive(new Service("medicos", "index"), (data) -> {
                        if (null != data) {
                            for (Object m: data)
                                System.out.println(m);
                        } else {
                            System.out.println("Nao ha registros.");
                        }
                    });
                })
                .add("Remover medico (ID)", () -> {
                    client.send(new Service("medicos", "destroy", InputID.show()));
                })
                .add("Buscar medico (ID)", () -> {
                    
                    client.receive(new Service("medicos", "show", InputID.show()), (data) -> {
                        if (null != data) {
                            System.out.println(data.get(0));
                        } else {
                            System.out.println("Registro nao encontrado.");
                        }
                    });
                }).run();
        }
    }
}
