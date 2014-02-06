package template;

import org.opendolphin.core.client.comm.UiThreadHandler;
import org.opendolphin.core.comm.DefaultInMemoryConfig;

public class ApplicationInMemoryStarter {
    public static void main(String[] args) throws Exception {
        DefaultInMemoryConfig config = new DefaultInMemoryConfig();
        config.registerDefaultActions();
        config.getClientDolphin().getClientConnector().setUiThreadHandler(new UiThreadHandler() {
            @Override
            public void executeInsideUiThread(Runnable runnable) {

            }
        });
        registerApplicationActions(config);
        solrTest.Main.clientDolphin = config.getClientDolphin();
        javafx.application.Application.launch(solrTest.Main.class);
    }

    private static void registerApplicationActions(DefaultInMemoryConfig config) {
        config.getServerDolphin().register(new ApplicationDirector());
    }

}
