package TVIS;

import javax.swing.JOptionPane;

/**
 * Used to show messages
 * @author user
 */
public class Logger {
    
    /**
     * Shows the messages
     * @param msg
     * @param symbol The image used in the message
     */
    public static void showMsg(String msg, String title, int symbol){
        JOptionPane.showMessageDialog(null, msg, title,symbol);
    }
    
    /**
     * Shows errors
     * @param msg 
     */
    public static void error(String msg){
        showMsg(msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Shows information
     * @param msg 
     */
    public static void info(String msg){
        showMsg(msg, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Shows confirmation message before closing
     */
    public static void close(){
        if(JOptionPane.showConfirmDialog(null, "Are you sure?", "Exit", JOptionPane.YES_NO_OPTION) == 0){
            System.exit(0);
        }
    }
}
