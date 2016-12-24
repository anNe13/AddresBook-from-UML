package Registry;

public class AutoSave implements Runnable{
    public void run() {
        while(true) {
            RegistryPersister autoSave = new RegistryPersister();
            autoSave.save();
            try {
                //System.out.println("autosaving");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
