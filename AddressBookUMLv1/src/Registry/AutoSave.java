package Registry;

public class AutoSave implements Runnable{
    public void run() {
        while(true) {
            RegistryPersister autoSave = new RegistryPersister();
            autoSave.save();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
