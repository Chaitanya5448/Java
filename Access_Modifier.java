public class Access_Modifier{
    public static void main(String[] args) {
        GpayAcc acx = new GpayAcc();
        acx.username = "Chaitanya";
        //no error pahije manun cancel kely
        //nahi tr Error hota ekde Password la not visible manun.
        acx.Password = "x0x0x0x0x0";
    }
}

class GpayAcc{
    public String username;
    // private String password hota !
    String Password;
}