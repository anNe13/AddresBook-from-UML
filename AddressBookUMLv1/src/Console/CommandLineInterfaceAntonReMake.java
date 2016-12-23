package Console;

import Registry.*;
import RemoteReg.CatalogueLoader;
import RemoteReg.RemoteRegistry;
import Command.*;

public class CommandLineInterfaceAntonReMake implements InputHandler{

    private Registry registry = new Registry();
    private RegistryPersisterAntonReMake registrypersister = new RegistryPersisterAntonReMake(registry);
    private RemoteRegistry remoteregistry = new RemoteRegistry();
    private CatalogueLoader catalogueloader = new CatalogueLoader(remoteregistry);

    private Console console = new Console();
    private AutoSave autosave = new AutoSave();//kan behöva göras så autosave tar in registrypersister som parameter

    private CommandInterpreterAntonReMake comandinterpreter;

    public CommandLineInterfaceAntonReMake(ApplicationAntonReMake app){
        comandinterpreter = new CommandInterpreterAntonReMake(registry,remoteregistry, registrypersister,app);
        catalogueloader.run();
        console.registerInputHandler(this);
    }

    @Override
    public void handle(CommandLine commandLine) {
        try {
            Command command = comandinterpreter.interpret(commandLine);

            command.execute();

        } catch (InvalidCommandException invComEx) {

        } catch (Exception ex) {

            console.print("Invalid command: " + commandLine.getCommand());
            ex.printStackTrace();
        }
    }
    }

