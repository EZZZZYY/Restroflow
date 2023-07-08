import org.junit.*;
import restro_flow.dashboardmain;
import static org.junit.Assert.*;

public class DashboardMainTest {

    private dashboardmain dashboard;

    @Before
    public void setUp() {
        dashboard = new dashboardmain();
    }

  
    public void testTitle() {
        assertEquals("RESTRO FLOW", dashboard.getTitle());
    }

   
    public void testVerifyUserButtonVisibility_AdminUser() {
        dashboard = new dashboardmain("admin@restroflow.com");
        assertFalse(dashboard.btnverifyUser.isVisible());
    }

   
    public void testVerifyUserButtonVisibility_NonAdminUser() {
        dashboard = new dashboardmain("user@example.com");
        assertTrue(dashboard.btnverifyuser.isVisible());
    }

    @Test
    public void testAdditional1ComponentVisibility() {
        assertFalse(dashboard.additional1.isVisible());
    }

    @After
    public void tearDown() {
        dashboard.dispose();
    }
}