public class Client
{
    String password;
    String money;

    public Client(String password, String money){
        this.password = password;
        this.money = money;
    }

    public String getPassword(){
        return password;
    }

    public String getMoney(){
        return money;
    }
}
