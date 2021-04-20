public class Proxy implements IAction
{
    private Action action;
    private Client user;

    public Proxy(Client user) {
        this.user = user;
    }

    private boolean checkPermissions() {
        if(user.getPassword().equals("1263") && user.getMoney().equals("20 000 tg")) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void actions(){
        if(checkPermissions()){
            action = new Action();
            action.actions();
        }
        else{
            System.out.println("Пароль неверный !");
        }
    }
}
