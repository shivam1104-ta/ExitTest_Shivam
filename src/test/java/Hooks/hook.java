package Hooks;

import Base_Package.Parent;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class hook extends Parent {
    
    @Before
    public void StartServer() throws InterruptedException {
        
        Setup();
        Permissions();
        ApiDemos();
    }
    
    @After
    public void StopServer()
    {
        DriverClose();
    }
    
}