package it.unibo.sweng.simplegwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see it.unibo.sweng.simplegwt.client.GreetingService#getDatabase
     */
    void getDatabase( AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see it.unibo.sweng.simplegwt.client.GreetingService#registrazioneUtente
     */
    void registrazioneUtente( java.util.ArrayList<java.lang.String> dati, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see it.unibo.sweng.simplegwt.client.GreetingService#deleteUtente
     */
    void deleteUtente( java.lang.String email, AsyncCallback<java.lang.String> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static GreetingServiceAsync instance;

        public static final GreetingServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (GreetingServiceAsync) GWT.create( GreetingService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instantiated
        }
    }
}
