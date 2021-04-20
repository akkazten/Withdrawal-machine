public class Main
{
    public static void main(String[] args){
        Client user_1 = new Client("1263", "20 000 tg");
        Proxy proxy = new Proxy(user_1);
        proxy.actions();

        Client user_2 = new Client("1264", "20 000 tg");
        Proxy proxy2 = new Proxy(user_2);
        proxy2.actions();
    }
}
