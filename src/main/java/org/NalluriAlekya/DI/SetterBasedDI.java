package org.NalluriAlekya.DI;

public class SetterBasedDI {
    private Message message;

    public void setMessage(Message message) {
       this.message= message;
    }
    public String showMessage(){
        String mse = this.message.getMessage();
        return mse + " from SetterBasedDI";
    }


}
