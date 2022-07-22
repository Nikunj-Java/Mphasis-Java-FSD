package Com.simplilearn.customexception;

public class AgeNotValidExecption extends Exception {
	
	private String msg;

	public AgeNotValidExecption(String msg) {
		 
		this.msg = msg;
		
	}

	@Override
	public String toString() {
		return "AgeNotValidExecption [message=" + msg + "]";
	}
    
	
	
	

	 
	
	

}
