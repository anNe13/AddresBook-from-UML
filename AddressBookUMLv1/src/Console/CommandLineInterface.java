package Console;

import Registry.*;
import RemoteReg.CatalogueLoader;
import RemoteReg.CatalogueLoaderNZ;
import RemoteReg.RemoteRegistry;
import Command.*;

public class CommandLineInterface implements InputHandler{

    private Registry registry = new Registry();
    private RegistryPersisterAntonReMake registrypersister = new RegistryPersisterAntonReMake(registry);
    private RemoteRegistry remoteregistry = new RemoteRegistry();
    private CatalogueLoaderNZ catalogueloader = new CatalogueLoaderNZ(remoteregistry);

    private Console console = new Console();
    private AutoSave autosave = new AutoSave(registrypersister); //kan behöva göras så autosave tar in registrypersister som parameter //yes:NZ, did it as parameter//
    private CommandInterpreter comandinterpreter;

    public CommandLineInterface(Application app){
        comandinterpreter = new CommandInterpreter(registry,remoteregistry, registrypersister,app);

        Thread autosaveThread = new Thread (autosave);
        autosaveThread.start();
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

