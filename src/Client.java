public class Client {
    public static void main(String[] args) {
        AppNotification appNotification = new AppNotification();
        PhoneNotification phoneNotification = new PhoneNotification();
        EmailNotification emailNotification = new EmailNotification();
        BankApplication tkcuaAnhDung = new BankApplication();
        tkcuaAnhDung.observerList.add(emailNotification);
        tkcuaAnhDung.observerList.add(phoneNotification);
        tkcuaAnhDung.update("Chi ck cho 100000000");
        tkcuaAnhDung.remove(phoneNotification);
        tkcuaAnhDung.add(appNotification);
        tkcuaAnhDung.update("Ck cho Chi 500000$");

    }
}
