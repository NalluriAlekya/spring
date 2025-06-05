package org.NalluriAlekya.DI;

public class ConstructorBasedDI {
    private final Message message;

    // Constructor-based dependency injection
    public ConstructorBasedDI(Message message) {
        this.message = message;
    }

    public String getMessage() {
        String mse = this.message.getMessage();
        return mse+"from ConstructorBasedDI";
    }

    // Additional methods can be added here to provide more functionality
}
