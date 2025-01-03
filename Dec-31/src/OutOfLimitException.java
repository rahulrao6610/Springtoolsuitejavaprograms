
public class OutOfLimitException extends Exception {
    String message;
    
    
	public OutOfLimitException(String message) {
		super();
		this.message = message;
	}

   
	@Override
	public String toString() {
		return "OutOfLimitException [message=" + message + "]";
	}
	}


