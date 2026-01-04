@ManagedBean(name = "tv")
public class TerminalView {
    public String handleCommand(String command, String[] params) {
        if (command.equals("rc")) {
        if(params.length > 0)
            return params[0].toUpperCase() + "in Ripples Code youtoube Channel";
        else
        return "JSE, PrimeFaces, Android, Flutter";
    }
    else if (command.equals("date")) {
            return new Date().toString();
        }
        else {
            return command  + "not found";
        }        
    }
