package Command;


import RemoteReg.RemoteRegistry;
import Registry.Registry;
import Registry.RegistryPersisterAntonReMake;
import Console.*;
import Contact.Contact;

public class QuitCommand implements Command {

    private RegistryPersisterAntonReMake registryPersister;

    public QuitCommand(RegistryPersisterAntonReMake registryPersister) {
        this.registryPersister=registryPersister;
        registryPersister.save();
        System.exit(0);

    }

    @Override
    public void execute() throws InvalidCommandParameterException {
        registryPersister.save();
    }
}
