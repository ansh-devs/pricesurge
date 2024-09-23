package in.anshdevs;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Core {
    public static void main(String[] args) {
        // runs the application until it receives termination signal.
        Quarkus.run(args);
        // listen for termination signal from the os.
        // helps in graceful shutdown of the service when stopped from containerized env. i.e docker .
        Quarkus.waitForExit();
    }
}
